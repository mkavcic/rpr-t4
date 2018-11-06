package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndexa;

    public Student(String ime, String prezime, Integer brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
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

}
