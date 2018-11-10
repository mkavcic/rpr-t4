package ba.unsa.etf.rpr.tutorijal04;

import java.util.*;


public class PlanStudija {
    private Map<Integer, List<Predmet>> mapa = new HashMap<>();


    public void dodajPredmet(Integer semestar, Predmet predmet) {
        Iterator<Map.Entry<Integer, List<Predmet>>> entries = mapa.entrySet().iterator();
        while(entries.hasNext()){
            var element = entries.next();
            if(element.getKey().equals(semestar)){
                List<Predmet> lista=element.getValue();
                lista.add(predmet);
            }
            else{
                List<Predmet> list1 = new ArrayList<>();
                list1.add(predmet);
                mapa.put(semestar, list1);
            }
        }
    }
}