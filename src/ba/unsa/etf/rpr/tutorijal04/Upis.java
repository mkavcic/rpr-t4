package ba.unsa.etf.rpr.tutorijal04;

public class Upis {
    private Student student;
    private PlanStudija studij;
    private Predmet predmet;

    public Upis(Student student, PlanStudija studij, Predmet predmet) {
        this.student = student;
        this.studij = studij;
        this.predmet = predmet;
    }

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
