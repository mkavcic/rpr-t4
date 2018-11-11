package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanStudijaTest {
    @Test
    void planStudijaTest() {
        PlanStudija etf = new PlanStudija();
        Student s1 = new Student("Mirna", "Kavčić", 17925);
        Predmet p1 = new Predmet("Razvoj programskih rješenja", 5, true);
        Predmet p2 = new Predmet("Digitalna elektronika", 5, false);
        etf.dodajPredmet(4, p2);
        Upis upis = new Upis(s1, etf, p1);
        assertEquals(etf, upis.getStudij());
        assertEquals(p1, upis.getPredmet());
        assertEquals(s1, upis.getStudent());
    }
}