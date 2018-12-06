package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
    private ArrayList<Drzava> drzava;

    public UN() {
        this.drzava = new ArrayList<>();
    }

    public ArrayList<Drzava> getDrzava() {
        return drzava;
    }

    public void setDrzava(ArrayList<Drzava> drzava) {
        this.drzava = drzava;
    }

    public void dodajDrzavu(Drzava drzava) {
        this.drzava.add(drzava);
    }
}
