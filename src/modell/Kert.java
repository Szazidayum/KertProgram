package modell;

import java.io.Serializable;
import modell.Noveny;
import java.util.ArrayList;
import java.util.List;

//kell ez az implementáció
public class Kert implements Serializable{

    private List<Noveny> novenyek;
    
//    public static void main(String[] args) {
//        KertProgram();
//        kiirList(novenyek);
//        
//        
////        Collections.sort(novenyek);
////        kiirList( novenyek);
//        
//    }
    
    private static void kiirList(List<Noveny> lista) {
        for (Noveny n: lista) { System.out.println(n); }
    }

    public Kert() {
        //ebben az osztályban található növények listájába fog belepakolni
        this.novenyek = new ArrayList<>();
        this.novenyek.add(new Noveny("Hortenzia", "ab00", 1000, 10));
        this.novenyek.add(new Noveny("Liliom", "ab01", 1500, 8));
        this.novenyek.add(new Noveny("Rózsa", "ab03", 500, 2));
    }
    
    public void vetel(Noveny noveny){
        this.novenyek.add(noveny);
    }
    
    public void eladas(Noveny noveny){
        this.novenyek.remove(noveny);
    }

    public List<Noveny> getNovenyek() {
        return novenyek;
    }

    public void setNovenyek(List<Noveny> novenyek) {
        this.novenyek = novenyek;
    }

    @Override
    public String toString() {
        return "Kert{" + "novenyek=" + novenyek + '}';
    }
    
    
    
}
