package com.example.lecture1.collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put( "C++", "Base of all the languages" );
        languages.put( "Python", "Widely used language" );
        languages.put( "Java", "Platform independent language" );
        languages.put( "HTML", "Design web page" );

        System.out.println(languages);

        if(languages.containsKey( "Java" )){
            System.out.println("Key already exists");
        }
        else {
            languages.put( "Java", "I am learning java" );
        }
       // System.out.println(languages);

        languages.remove( "HTML" );
        System.out.println("=====================================");

        // loop through the kay-value pairs
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
