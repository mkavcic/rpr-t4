package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultetTest {
    @Test
    void fakultetTest() {
        Fakultet fakultet = new Fakultet();
        Student s1 = new Student("Mirna", "Kavčić", 17925);
        Student s2 = new Student("Meho", "Mehić", 17926);
        Predmet p1 = new Predmet("Razvoj programskih rješenja", 5, true);
        Predmet p2 = new Predmet("Inžejerkska matematika 2", 6, false);
        PlanStudija bolonja = new PlanStudija();
        bolonja.dodajPredmet(3, p1);
        bolonja.dodajPredmet(2, p2);
        fakultet.dodajStudenta(s1);
        fakultet.dodajStudenta(s2);
        fakultet.dodajPredmet(p1);
        fakultet.dodajPredmet(p2);
        fakultet.upisi(s1, bolonja, p1);
        fakultet.upisi(s2, bolonja, p1);
        fakultet.upisi(s1, bolonja, p2);
        fakultet.upisi(s2, bolonja, p2);
        assertEquals("Meho Mehić\nMirna Kavčić\n", fakultet.dajSpisak(p1));
    }

}