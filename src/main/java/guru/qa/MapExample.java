package guru.qa;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        HashMap<String, String> countryHashMap = new HashMap<String, String>();

        countryHashMap.put("Russia", "Moscow");
        countryHashMap.put("Germany", "Berlin");
        countryHashMap.put("Austria", "Vienna");
        countryHashMap.put("France", "Paris");

        for(HashMap.Entry<String, String> entry: countryHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        countryHashMap.remove("France");

        System.out.println("Размер countryHashMap после удаления = " + countryHashMap.size());
        for(HashMap.Entry<String, String> entry: countryHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        System.out.println("Содержит countryHashMap key 'Russia'? " + countryHashMap.containsKey("Russia"));
        System.out.println("Содержит countryHashMap value 'Paris'? " + countryHashMap.containsValue("Paris"));
    }




}
