package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndexa;
    private Integer ectsBodovi;
    private Semestar semestar;
    private Integer brojIzbornih;
    private Integer brojObaveznih;
    private ArrayList<Predmet> predmeti;

    public Student(String ime, String prezime, Integer brojIndexa, Semestar semestar) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
        this.semestar = semestar;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Integer getBrojIndexa() {
        return brojIndexa;
    }

    public Integer getEctsBodovi() {
        return ectsBodovi;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public Integer getBrojIzbornih() {
        return brojIzbornih;
    }

    public Integer getBrojObaveznih() {
        return brojObaveznih;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }
    public void dodajPredmet(Predmet predmet){

    }
}
