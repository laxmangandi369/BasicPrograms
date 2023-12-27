package com.ArrayPrograms;

import java.util.*;

public class SortMapDemo {


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

       /*
       Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        */

        /*
        // using lambda expression
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        for (Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey()+ " = "+entry.getValue());
        }

        */

    //    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


        Map<Student, Integer> studentMap = new TreeMap<>((o1, o2) -> o1.getId().compareTo(o2.getId()));
        studentMap.put(new Student(1, 101, "ganesh", "Graduate Trainee Engineer", 150000.00), 60);
        studentMap.put(new Student(3, 103, "dinesh", "welder", 250000.00), 90);
        studentMap.put(new Student(4, 104, "naresh", "Design Engineer", 600000.00), 150);
        studentMap.put(new Student(2, 102, "ramesh", "Mechanical Engineer", 350000.00), 200);
  //      System.out.println(studentMap);

  //      studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName))).forEach(System.out::println);
  //      studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName).reversed())).forEach(System.out::println);
  //      studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName).thenComparing(Student::getSalary))).forEach(System.out::println);

    //    studentMap.forEach((k,v)-> System.out.println(k+" = "+v));

    //    studentMap.entrySet().stream().forEach(System.out::println);

        //  or to above
//	studentMap.entrySet().stream().forEach(t-> System.out.println(t));

        // if we want to sort even numbers in HashMap
//	studentMap.entrySet().stream().filter(v -> v.getValue()%2 == 0).forEach(t-> System.out.println(t));
    }
}
