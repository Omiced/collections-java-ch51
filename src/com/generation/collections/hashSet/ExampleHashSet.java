package com.generation.collections.hashSet;

import java.util.HashSet;

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> cities =new HashSet<>();
        cities.add("CDMX");
        cities.add("Guadalajara");
        cities.add("Tijuana");
        cities.add("Toluca");
        System.out
                .println("Viendo que retorna false si ya existe "
                        + cities.add("CDMX"));
        System.out.println("Obteniendo el tamaño del set con size(): " + cities.size());
        System.out.
                println("Comprobando si esta vacio el set con isEmpty(): " + cities.isEmpty());
        System.out.println(cities);
        System.out.println("Removiendo un elemento usando remove(): " + cities.remove("CDMX"));

        for(String city: cities){
            System.out.println(city);
        }

        cities.forEach(city -> System.out.println(city));

    }
}
