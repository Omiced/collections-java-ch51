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
    learnes.put("Pedro Nuno",21);
    }
}