package nezet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import modell.Kert;
import modell.Noveny;


public class KertProgram {
    private static File fajl = new File("kert.bin");
    static String kimenet = "";
    
    public static void main(String[] args) throws ClassNotFoundException {
        Noveny noveny;
        Kert kert = new Kert();
        vetelKertbe(kert);
        eladasKertbol(kert, new Noveny("Rózsa", "ab03", 500, 2));
        fajlbaIras(kert);
        kertNullazas(kert);
        fajlbolOlvasas(kert);
    }
    
    
    
    public static void fajlbaIras(Kert kert){
//        List<Noveny> novenyek = kert.getNovenyek();
//        for (Noveny noveny : novenyek) {
//            kimenet += noveny.getNev()+","+noveny.getId()+","+noveny.getAr()+","+noveny.getKor()+"\n";
//        }
        
        try {
            FileOutputStream fajlKi = new FileOutputStream(fajl);
            ObjectOutputStream objKi = new ObjectOutputStream(fajlKi);
//            Files.write(Paths.get("kert2.bin"), kimenet.getBytes());
            objKi.writeObject(kert);
            objKi.close();
            fajlKi.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public static void fajlbolOlvasas(Kert kert) throws ClassNotFoundException{
        try {
            FileInputStream fajlBe = new FileInputStream(fajl);
            ObjectInputStream objBe = new ObjectInputStream(fajlBe);
            kert = (Kert)objBe.readObject();
            objBe.close();
            fajlBe.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public static void vetelKertbe(Kert kert){
        kert.vetel(new Noveny("Tulipán", "ab04", 200, 1));
        kert.vetel(new Noveny("Orgona", "ab05", 750, 2));
    }
    
    public static void kertNullazas(Kert kert){
        kert.setNovenyek(null);
    }
    
    public static void eladasKertbol(Kert kert, Noveny noveny){ 
        kert.eladas(noveny);
    }
}
