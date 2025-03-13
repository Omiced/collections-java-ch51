package com.generation.collections.arrayList;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Frida");
        names.add("Jonathan");
        names.add("Edgar");
        names.add(1,"Mar");
        System.out.println("Metodo isEmpyt " + names.isEmpty());
        System.out.println("Array de nombres " + names);
        System.out.println("Obtener elemento con su indice usando get(): " + names.get(2));
        System.out.println("Obtener el indice de un elemento usando indexOf(): " + names.indexOf("Mar"));
        System.out.println("Remover un elemento por su indice usando remove(): " + names.remove(3));
        names.add("Frida");
        System.out.println("Remover un elemento por nombre usando remove(): " + names.remove("Frida"));
        System.out.println("Array de nombres " + names);
        System.out.println("Obteniendo el tamaño del array con size(): " + names.size());

        names.forEach(name -> System.out.println(name.toUpperCase()));
        names.clear();
        System.out.println("Array de nombres " + names);


    }
}
