package ba.unsa.rpr.tutorijal7;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import java.io.Serializable;

public class Grad implements Serializable {
    private SimpleStringProperty naziv;
    private SimpleIntegerProperty brojStanovnika;
    private SimpleDoubleProperty[] temperature=new SimpleDoubleProperty[1000];

    public Grad() {
        this.naziv = new SimpleStringProperty("");
        this.brojStanovnika = new SimpleIntegerProperty(0);
        for (SimpleDoubleProperty simpleDoubleProperty : this.temperature ) simpleDoubleProperty = new SimpleDoubleProperty(0);
    }

    public Grad(SimpleStringProperty naziv, SimpleIntegerProperty brojStanovnika, SimpleDoubleProperty[] temeperature) {
        this.naziv=naziv;
        this.brojStanovnika=brojStanovnika;
        int i=0;
        for (SimpleDoubleProperty simpleDoubleProperty : this.temperature ) simpleDoubleProperty = temeperature[i+1];
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

    public SimpleDoubleProperty[] getTemperature() {
        return temperature;
    }

    public void setTemperature(SimpleDoubleProperty[] temepature) {
        this.temperature = temepature;
    }
}
