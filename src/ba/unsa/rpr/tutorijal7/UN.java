package ba.unsa.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
    private ArrayList<Drzava> drzava;
    private ArrayList<Grad> grad;

    public ArrayList<Grad> getGradovi() {
        return grad;
    }

    public void setGradovi(ArrayList<Grad> gradovi) {
        this.grad = gradovi;
    }

    public void dodajGrad(Grad grad) {
        this.grad.add(grad);
    }

    public UN() {
        this.drzava = new ArrayList<>(); this.grad = new ArrayList<>();
    }

    public ArrayList<Drzava> getDrzava() {
        return this.drzava;
    }

    public void setDrzava(ArrayList<Drzava> drzava) {
        this.drzava = drzava;
    }

    public void dodajDrzavu(Drzava drzava) {
        this.drzava.add(drzava);
    }
}
