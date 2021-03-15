package com.example.lecture1.collection;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class CustomMapImpl {
    public static void main(String[] args) {

        // get the hash value
//        int[] arr = {1,2,3};
//        System.out.println(arr);
//        System.out.println(arr.hashCode());
        //System.out.println( Arrays.i.hashCode());

        CustomMapImpl customMap = new CustomMapImpl();
        // get the hashcode of custom oject
        System.out.println(customMap.hashCode());

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put( "Key1", "value1" );
        stringMap.put( "Key2", "value2" );
        stringMap.put( "Key3", "value3" );

        stringMap.put( "Key1", "value2" );
        System.out.println(stringMap);

        Map<String, List<String>> multipleVals = new HashMap();

        List<String> mulList = new ArrayList<>();
        mulList.add("Value1");
        mulList.add("Value2");

        multipleVals.put( "Key1", mulList );
        System.out.println(multipleVals);


        // create a Map with custom class
        Map<Student, String> testStudent = new HashMap();
        testStudent.put( new Student("123","Aayasha"), "new Student" );
        testStudent.put( new Student("123","Aayasha"), "new Student" );
        testStudent.put( new Student("125","Mira"), "second Student" );
        System.out.println(testStudent);

        // create a Map with buid in class
        Map<String, String> testString = new HashMap();
        testString.put( new String("Keytest"), "value1" );
        testString.put( new String("Keytest"), "value1" );
        System.out.println(testString);

//        testString.put( "Keytest", "value2" );
//        testString.put( "Keytest", "value2" );
//        System.out.println(testString);
    }

}
