package ba.unsa.etf.rpr;

import java.util.Set;

public class Fakultet {
    private Set<Student> studenti;
    private Set<Predmet> predmeti;
    private Set<Upis> upisani;


    public void dodajStudenta(Student s){
        studenti.add(s);
    }

    public void dodajPredmet(Predmet p){
        predmeti.add(p);
    }

    public void upisi( Upis u){
        upisani.add(u);
    }

}
