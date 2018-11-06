package ba.unsa.etf.rpr.tutorijal04;

public class Predmet {
    private String ime;
    private Integer opterecenje;
    private boolean izborni;

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
}
