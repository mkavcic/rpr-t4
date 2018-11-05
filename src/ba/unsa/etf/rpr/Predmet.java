package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {
    private String ime;
    private Integer opterecenje;
    private boolean izborni;
    private ArrayList<Student> spisak;
    private Integer semestar;

    public Predmet(String ime, Integer opterecenje, boolean izborni) {
        this.ime = ime;
        this.opterecenje = opterecenje;
        this.izborni = izborni;
    }

    public String dajIme() {
        return ime;
    }

    public Integer dajOpterecenje() {
        return opterecenje;
    }

    public boolean jeLiIzborni() {
        return izborni;
    }

    public ArrayList<Student> dajSpisak() {
        return spisak;
    }

    public void upisi(Student student){

    }

    public void ispisi(Student student){

    }
}
