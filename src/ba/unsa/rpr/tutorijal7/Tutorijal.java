package ba.unsa.rpr.tutorijal7;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.beans.XMLDecoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {

    Tutorijal() {
    }

    public static void main(String[] args) {

        //System.out.println("1");

            UN un = ucitajXml(ucitajGradove());

            for(Drzava d : un.getDrzava())
                System.out.println(d.getNaziv() + " " + d.getGlavniGrad() + " " + d.getBrojStanovnika() + " " + d.getPovrsina() + " " + d.getPovrsina());


       // ArrayList<Grad> grad = ucitajGradove();









        }




    public static ArrayList<Grad> ucitajGradove() {
        ArrayList<Grad> gradovi = new ArrayList<>();
        Scanner ulaz;
        int brojac = -1;
        try {
            ulaz = new Scanner(new FileReader("mjerenja.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti.");
            System.out.println("Greška: " + e);
            return null;
        }
        try {
            while (ulaz.hasNextLine()) {
                boolean zarez = false;
                String str = "";
                String grad = ulaz.nextLine();
                int tempBrojac = 0;
                brojac++;
                for (int i = 0; i < grad.length(); i++) {
                    if (grad.charAt(i) == ',' && !zarez) {
                        gradovi.add(new Grad());
                        gradovi.get(brojac).setNaziv(str);
                        zarez = true;
                        str = "";
                    } else if (grad.charAt(i) == ',' && zarez) {
                        gradovi.get(brojac).getTemperature()[tempBrojac] = Double.parseDouble(str);
                        str = "";
                        tempBrojac++;
                    } else if (grad.charAt(i) != ',') {
                        str += grad.charAt(i);
                    }

                    if (tempBrojac == 1000)
                        break;
                }
            }
        } catch (Exception e) {
        }

        return gradovi;


    }

    public static UN ucitajXml(ArrayList<Grad> gradovi){
        UN un = new UN();
        Document xmldoc = null;
        double t[] = new double[10];
        Grad grad = new Grad ("Sarajevo",1000,t);
        un.dodajGrad(grad);
        try {
            DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            xmldoc = docReader.parse(new File("drzave.xml"));
            NodeList djeca = xmldoc.getDocumentElement().getChildNodes();
            for(int i = 0; i < djeca.getLength(); i++){
                Node dijete = djeca.item(i);
                Drzava drzava = new Drzava();
                NodeList djeca2 = dijete.getChildNodes();
                for(int j = 0; j < djeca2.getLength(); j++){
                    Node dijete2 = djeca2.item(j);
                    if(dijete2 instanceof Element){
                        Element el = (Element)dijete2;
                        if(el.getTagName() == "naziv"){
                            drzava.setNaziv(el.getNodeValue());
                        }
                    }
                }
            }
        }catch (Exception e){

        }

        for(Drzava d : un.getDrzava()){
            for(Grad g : gradovi){
                if(d.getGlavniGrad().getNaziv() == g.getNaziv()){
                    d.getGlavniGrad().setTemperature(g.getTemperature());
                }
            }
        }
        return un;
    }
}