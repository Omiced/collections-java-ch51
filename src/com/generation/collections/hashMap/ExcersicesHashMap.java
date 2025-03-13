package com.generation.collections.hashMap;

import java.util.HashMap;

public class ExcersicesHashMap {
    public static void main(String[] args) {
        String[] words = {"java", "python", "golang", "kotlin", "python", "java", "rust", "typescript", "rust", "kotlin","rust"};
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String word: words){
            wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
        }

        System.out.println(wordCount);
    HashMap<String,Integer>learners = new HashMap<>();
	learners.put("Adair",24);
    learners.put("Osbaldo",30);
    learners.put("Josue", 31);
    learners.put("Carlos", 27);
  learners.put("Raziel G", 25);
    }

}
