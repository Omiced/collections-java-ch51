package com.generation.collections.arrayList;

import java.util.ArrayList;

public class ExercisesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =  new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        ArrayList<Integer> numbers2 = createArrayWithElements(100);
        System.out.println(numbers2);

       /* for(Integer number : numbers){
            System.out.println(number * 2);
        }

        numbers.forEach(number -> System.out.println(number * 3));*/
        multiplyByTwo(numbers);

    }

    private static void multiplyByTwo(ArrayList<Integer> numbers){
        numbers.forEach(number -> System.out.println(number * 2));
    }

    private static ArrayList<Integer> createArrayWithElements(int nElemtns){
        ArrayList<Integer> numbers =  new ArrayList<>();
        for(int i = 1; i <= nElemtns; i++){
            numbers.add(i);
        }
        return numbers;
    }


}
