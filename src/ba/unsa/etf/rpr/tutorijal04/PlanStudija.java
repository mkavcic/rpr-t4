package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashMap;
import java.util.List;
import  java.util.Map;


public class PlanStudija {
    private Map<Integer, List<Predmet>> mapa = new HashMap<>();


    public void dodajPredmet(Integer semestar, Predmet predmet) {
        List<Predmet> predmeti = mapa.get(semestar);
        if(predmeti!= null) predmeti.add(predmet);
    }
}