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

    public String dajIme() {
        return ime;
    }

    public String dajPrezime() {
        return prezime;
    }

    public Integer dajBrojIndexa() {
        return brojIndexa;
    }

    public Integer dajEctsBodovi() {
        return ectsBodovi;
    }

    public Semestar dajSemestar() {
        return semestar;
    }

    public Integer dajBrojIzbornih() {
        return brojIzbornih;
    }

    public Integer dajBrojObaveznih() {
        return brojObaveznih;
    }

    public ArrayList<Predmet> dajPredmeti() {
        return predmeti;
    }
    public void dodajPredmet(Predmet predmet){

    }
}
