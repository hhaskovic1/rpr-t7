package ba.unsa.rpr.tutorijal7;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import java.io.Serializable;

public class Grad implements Serializable {
    private String naziv;
    private Integer brojStanovnika;
    private double[] temperature=new double[1000];

    public Grad() {
        this.naziv = new String("");
        this.brojStanovnika = new Integer(0);
        for (double simpleDoubleProperty : this.temperature ) simpleDoubleProperty = 0;
    }

    public Grad(String naziv, Integer brojStanovnika, double[] temeperature) {
        this.naziv=naziv;
        this.brojStanovnika=brojStanovnika;
        int i=0;
        for (double simpleDoubleProperty : this.temperature ) simpleDoubleProperty = temeperature[i+1];
    }

    public String getNaziv() {
        return this.naziv;
    }

    public String nazivProperty() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv=naziv;
    }

    public int getBrojStanovnika() {
        return this.brojStanovnika;
    }

    public Integer brojStanovnikaProperty() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika=brojStanovnika;
    }

    public double[] getTemperature() {
        return temperature;
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }
}
