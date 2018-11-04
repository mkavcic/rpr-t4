package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {
    private ArrayList<Predmet> spisakPredmeta;
    private Integer redniBroj;

    public Semestar(ArrayList<Predmet> spisakPredmeta, Integer redniBroj) {
        this.spisakPredmeta = spisakPredmeta;
        this.redniBroj = redniBroj;
    }

    public ArrayList<Predmet> dajSpisakPredmeta() {
        return spisakPredmeta;
    }

    public Integer dajRedniBroj() {
        return redniBroj;
    }

    public void dodajPredmet(Predmet predmet){

    }
}
