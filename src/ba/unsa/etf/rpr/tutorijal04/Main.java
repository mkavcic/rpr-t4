package ba.unsa.etf.rpr.tutorijal04;


public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Mirna", "Kavčić", 17925);
        Student s2 = new Student("Hana", "Hanić", 17926);
        Student s3 = new Student("Nedim", "Osmić", 17927);
        Student s4 = new Student("Meho", "Mehić", 17928);
        Student s5 = new Student("Dino", "Sikira", 17929);
        Student s6 = new Student("Anela", "Sikira", 17930);

        Predmet p1= new Predmet("Inženjerska matematika 1", 6, false );
        Predmet p2 = new Predmet("Razvoj programskih rješenja", 5, true);
        Predmet p3 = new Predmet("Digitalna elektronika", 5, false);
        Predmet p4= new Predmet("Dinamički sistemi", 5, true);

        PlanStudija bolonja= new PlanStudija();

        Fakultet ETF = new Fakultet();

        ETF.dodajStudenta(s1);
        ETF.dodajStudenta(s2);
        ETF.dodajStudenta(s3);
        ETF.dodajStudenta(s4);
        ETF.dodajStudenta(s5);
        ETF.dodajStudenta(s6);

        ETF.dodajPredmet(p1);
        ETF.dodajPredmet(p2);
        ETF.dodajPredmet(p3);
        ETF.dodajPredmet(p4);

        bolonja.dodajPredmet(1 ,p1);
        bolonja.dodajPredmet(3, p2);
        bolonja.dodajPredmet(5, p2);
        bolonja.dodajPredmet(4, p3);
        bolonja.dodajPredmet(3, p4);

        ETF.upisi(s1, bolonja, p1);
        ETF.upisi(s1, bolonja, p2);
        ETF.upisi(s2, bolonja, p3);
        ETF.upisi(s2,bolonja, p4);
        ETF.upisi(s3, bolonja, p1);
        ETF.upisi(s3, bolonja, p2);
        ETF.upisi(s3, bolonja, p3);
        ETF.upisi(s3,bolonja, p4);
        ETF.upisi(s4, bolonja, p2);
        ETF.upisi(s4, bolonja, p3);
        ETF.upisi(s4,bolonja, p4);
        ETF.upisi(s5, bolonja, p2);
        ETF.upisi(s6, bolonja, p3);
        ETF.upisi(s5,bolonja, p4);

        String spisak=ETF.dajSpisak(p1);
        System.out.print(spisak);
    }
}
