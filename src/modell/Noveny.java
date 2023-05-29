package modell;

import java.io.Serializable;

public class Noveny implements Serializable{
    
    private final String nev;
    private String id;
    private int ar, kor;
    
    public Noveny(String nev, String id, int ar, int kor) {
        this.nev = nev;
        this.id = id;
        this.ar = ar;
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public int getKor() {
        return kor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Noveny{" + "nev=" + nev + ", id=" + id + ", ar=" + ar + ", kor=" + kor + '}';
    }


    
    
    
    
}
