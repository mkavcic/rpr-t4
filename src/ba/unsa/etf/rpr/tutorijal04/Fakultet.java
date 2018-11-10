package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashSet;
import java.util.Set;

public class Fakultet {
    private Set<Student> studenti = new HashSet<>();
    private Set<Predmet> predmeti = new HashSet<>();
    private Set<Upis> upisani = new HashSet<>();


    public void dodajStudenta(Student s){
        studenti.add(s);
    }

    public void dodajPredmet(Predmet p){
        predmeti.add(p);
    }

    public void upisi( Upis u){
        upisani.add(u);
    }

    public void upisi(Student student, PlanStudija studij,  Predmet predmet){ upisani.add( new Upis(student, studij, predmet)); }

}

