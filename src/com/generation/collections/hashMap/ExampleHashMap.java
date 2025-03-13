package com.generation.collections.hashMap;

import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<String,String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("Mexico", "CDMX");
        countriesAndCapitals.put("Japon", "Tokyo");
        countriesAndCapitals.put("Suecia", "Estocolmo");
        countriesAndCapitals.put("Rusia", "Moscu");
        countriesAndCapitals.put("Colombia", "Bogota");
        countriesAndCapitals.put("China", "Bogota");
        countriesAndCapitals.put("Mexico", "Toluca");



        System.out.println(countriesAndCapitals);

        System.out.println("La capital de Japon es: " + countriesAndCapitals.get("Japon"));
        System.out.println("Viendo si la llave Mexico existe: " + countriesAndCapitals.containsKey("Mexico") );
        System.out.println("Viendo si la llave China existe: " + countriesAndCapitals.containsKey("China") );
        System.out.println("Obteniendo todas llaves " + countriesAndCapitals.keySet());
        System.out.println("Obteniendo valores " + countriesAndCapitals.values());

        for(String country : countriesAndCapitals.keySet()){
            System.out.println(countriesAndCapitals.get(country));
        }

        countriesAndCapitals.put("Mexico", "CDMX");
        countriesAndCapitals.remove("China");

        System.out.println(countriesAndCapitals);
    }
}
