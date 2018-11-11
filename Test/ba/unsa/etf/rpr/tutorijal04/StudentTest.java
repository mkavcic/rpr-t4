package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void studentTest() {
        Student student = new Student("Mirna", "Kavčić", 17925);
        assertAll(
                () -> assertEquals("Mirna", student.dajIme()),
                () -> assertEquals("Kavčić", student.dajPrezime()),
                () -> assertEquals((Integer) 17925, student.dajBrojIndexa())
        );
    }
}