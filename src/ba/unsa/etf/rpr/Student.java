package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndexa;
    private Integer brojEcts;
    private Integer semestar;
    private final Integer brojObaveznihEcts=30;
    private Integer brojIzbornihNaSemestru;
    private Integer brojObaveznihNaSemestru;
    private final Integer brojIzbornih=0;
    private final Integer brojObaveznih=0;

    public Student(String ime, String prezime, Integer brojIndexa, Integer brojEcts, Integer semestar) {
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

    public Integer dajBrojEcts() {
        return brojEcts;
    }

    public Integer dajBrojIzbornihNaSemestru() {
        return brojIzbornihNaSemestru;
    }

    public Integer dajBrojObaveznihhNaSemestru() {
        return brojObaveznihNaSemestru;
    }

    public Integer dajBrojObaveznih() {
        return brojObaveznih;
    }

    public Integer dajBrojIzbornih() { return brojIzbornih; }

    public void postavibrojIzbornihNaSemestru(Integer broj) { this.brojIzbornihNaSemestru=broj; }

    public void postavibrojObaveznihNaSemestru(Integer broj) { this.brojObaveznihNaSemestru=broj;  }

}
