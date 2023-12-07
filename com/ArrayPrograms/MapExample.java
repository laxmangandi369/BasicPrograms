package com.ArrayPrograms;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Guru");
        map.put(102, "Mauli");
        map.put(103, "Golya");
        map.put(104, "tina");

        System.out.println(map); // {101=Guru, 102=Mauli, 103=Golya, 104=tina}
        System.out.println(map.get(101)); // Guru
        System.out.println(map.get(105)); // null
        System.out.println(map.containsKey(101)); // true
        System.out.println(map.containsKey(105)); // false

//        Collection<String> values = map.values();
//        for (String v : values){
//            System.out.println(v);
//        }

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet){
            System.out.print(key);
            System.out.println(map.get(key));
        }

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();

//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> entry = iterator.next();
//            System.out.println(entry.getKey()+"="+entry.getValue());
//
//        }
            
        // by using forEach loop 
        for (Map.Entry<Integer,String> entry : entrySet) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
