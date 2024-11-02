package Clase.TravelGuide;

import java.util.*;

public class TravelGuide {

    private Map<String, SortedMap<String, SortedSet<Landmark>>> tg = new HashMap<>();

    public void addLandmark(String country, String city, Landmark landmark) {
        if (!tg.containsKey(country)) {
            tg.put(country, new TreeMap<>());
        }
        if (!tg.get(country).containsKey(city)) {
            tg.get(country).put(city, new TreeSet<>());
        }
        tg.get(country).get(city).add(landmark);
    }

    public int landmarksCount(String country, String city) {
        int count = 0;
        if (!tg.containsKey(country) || !tg.get(country).containsKey(city)) {
            return count;
        }
        count = tg.get(country).get(city).size();
        return count;
    }

    public int landmarksCount(String country) {
        int count = 0;
        if (tg.containsKey(country)) {
            for (Set<Landmark> landmarks : tg.get(country).values()) {
                count += landmarks.size();
            }
        }
        return count;
    }

    public Collection<Landmark> getLandmarksFromCity(String country, String city) {
        // el getOrDefault al poner un TreeMap<>(), no falla el programa en caso de querer acceder
        return tg.getOrDefault(country, new TreeMap<>()).getOrDefault(city, new TreeSet<>());
    }

    public Collection<Landmark> getLandmarksFromCountry(String country) {
        Collection<Landmark> toReturn = new ArrayList<>(); // coloco un ArrayList porque solo me
        // interesa mantener el orde de inserción
        for (String city : tg.getOrDefault(country, new TreeMap<>()).keySet()){
           toReturn.addAll(getLandmarksFromCity(country, city));
        }
        return toReturn;
    }

    public void moveLandmark(String country, String originCity, String destCity, Landmark landmark) {
        if (!tg.containsKey(country)) {
           throw new TravelGuideException("Country does not exist");
        }
        if (!tg.get(country).containsKey(originCity)) {
            throw new TravelGuideException("Origin city does not exist");
        }
        if (!getLandmarksFromCity(country, originCity).contains(landmark)) {
            throw new TravelGuideException("Landmark does not exist in origin city");
        }
        tg.get(country).get(originCity).remove(landmark);
        addLandmark(country, destCity, landmark);
    }
}