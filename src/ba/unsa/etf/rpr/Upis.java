package ba.unsa.etf.rpr;

public class Upis {
    private Student student;

    public Upis(Student student, PlanStudija studij, Predmet predmet) {
        this.student = student;
        this.studij = studij;
        this.predmet = predmet;
    }

    private PlanStudija studij;
    private Predmet predmet;

    public Student getStudent() {
        return student;
    }

    public PlanStudija getStudij() {
        return studij;
    }

    public Predmet getPredmet() {
        return predmet;
    }
}
