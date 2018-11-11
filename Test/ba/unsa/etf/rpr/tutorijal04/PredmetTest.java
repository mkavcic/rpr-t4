package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    @Test
    void predmetTest() {
        Predmet predmet = new Predmet("Razvoj programskih rješenja", 5, true);
        assertAll(
                () -> assertEquals("Razvoj programskih rješenja", predmet.dajIme()),
                () -> assertEquals((Integer) 5, predmet.dajOpterecenje()),
                () -> assertEquals(true, predmet.jeLiIzborni())
        );
    }
}