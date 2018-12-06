package ba.unsa.rpr.tutorijal7;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import java.io.Serializable;

public class Drzava implements Serializable {
    private SimpleStringProperty naziv;
    private SimpleIntegerProperty brojStanovnika;
    private SimpleDoubleProperty povrsina;
    private SimpleStringProperty jedinicaZaPovrsinu;
    private Grad glavniGrad;

    public Drzava() {
        naziv = new SimpleStringProperty("");
        brojStanovnika = new SimpleIntegerProperty(0);
        povrsina = new SimpleDoubleProperty(0);
        jedinicaZaPovrsinu = new SimpleStringProperty("");
        glavniGrad = null;
    }

    public Drzava(SimpleStringProperty naziv, SimpleIntegerProperty brojStanovnika, SimpleDoubleProperty povrsina, SimpleStringProperty jedinicaZaPovrsinu, Grad glavniGrad) {
        this.naziv = naziv;
        this.brojStanovnika=brojStanovnika;
        this.povrsina=povrsina;
        this.jedinicaZaPovrsinu=jedinicaZaPovrsinu;
        this.glavniGrad=glavniGrad;
    }

    public String getNaziv() {
        return naziv.get();
    }

    public SimpleStringProperty nazivProperty() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv.set(naziv);
    }

    public int getBrojStanovnika() {
        return brojStanovnika.get();
    }

    public SimpleIntegerProperty brojStanovnikaProperty() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika.set(brojStanovnika);
    }

    public double getPovrsina() {
        return povrsina.get();
    }

    public SimpleDoubleProperty povrsinaProperty() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina.set(povrsina);
    }

    public String getJedinicaZaPovrsinu() {
        return jedinicaZaPovrsinu.get();
    }

    public SimpleStringProperty jedinicaZaPovrsinuProperty() {
        return jedinicaZaPovrsinu;
    }

    public void setJedinicaZaPovrsinu(String jedinicaZaPovrsinu) {
        this.jedinicaZaPovrsinu.set(jedinicaZaPovrsinu);
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }


}
