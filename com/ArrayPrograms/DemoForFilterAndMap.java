package com.ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoForFilterAndMap {

    public static void main(String[] args) {
        List<EmployeeTest> employeeList = Arrays.asList(
                new EmployeeTest(101, "Akshay", 10000, 30, "Delhi"),
                new EmployeeTest(102, "Vijay", 5000, 16, "Delhi"),
                new EmployeeTest(101, "Ajay", 40000, 29, "Mumbai"),
                new EmployeeTest(101, "Baba", 50000, 30, "Pune"),
                new EmployeeTest(101, "Sushant", 60000, 29, "Ahmdabad"));

        // Usage of filter and map
        // if we want to sort the collection of salary is greater than 20000

        // it will fetch employeeTest object all parameter
    //    List<EmployeeTest> salaryGreaterThan20k = employeeList.stream().filter(salary -> salary.getSalary() > 20000).collect(Collectors.toList());

        // if we want to ftch only salaries (i.e.salary parameter)
        //     List<Double> salaryGreaterThan20k = employeeList.stream().filter(salary -> salary.getSalary() > 20000).map(e -> e.getSalary()).collect(Collectors.toList());
   //     System.out.println(salaryGreaterThan20k);


        // if we want to fetch employee names only
//      employeeList.stream().map(e -> e.getEmpName()).forEach(t -> System.out.print(t + " "));

        // or
    //    employeeList.stream().forEach(t -> System.out.print(t.getEmpName() + " "));

        // or
//        List<String> employeeNameList = employeeList.stream().map(e -> e.getEmpName()).collect(Collectors.toList());
//        System.out.println(employeeNameList);



        // if we want to fetch city= "delhi" along with emp name and salary only
    //    employeeList.stream().filter(t -> t.getCity() == "Delhi").forEach(t -> System.out.println(t.getEmpName() + " = " + t.getSalary()));


        // if we want fetch employee whose salary is greater than 30000

// employeeList.stream().filter(e->e.getSalary() > 30000).forEach(t->System.out.println(t.getName()));



        // if we want to arrange salary in ascending order
	//   Comparator<EmployeeTest> c = (i1, i2)-> (i1.getSalary() - i2.getSalary());
    //    Comparator<EmployeeTest> c = (i1, i2)-> i1.getSalary().compareTo(i2.getSalary());
      //  employeeList.stream().sorted(c).forEach(t->System.out.println(t));


        // if we want to arrange Name in ascending order
        // Comparator<EmployeeTest> c = (i1,i2)-> i1.getEmpName().compareTo(i2.getEmpName());
        //	employeeList.stream().sorted(c).forEach(t->System.out.println(t));


        // if we want to group by salary
    //    Map<Integer, List<EmployeeTest>> groupBySalary = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getSalary()));
    //    System.out.println(groupBySalary);



        // if we want to group by city

    //    Map<String, List<EmployeeTest>> collect2 = employeeList.stream().collect(Collectors.groupingBy(emp->emp.getCity()));
    //    System.out.println(collect2);

        /*
        // if we want to group by city and also print emp name only

        Map<String,List<String>> collect4 = employeeList.stream().collect(Collectors.groupingBy(emp->emp.getCity(),Collectors.mapping(EmployeeTest::getEmpName, Collectors.toList())));
        System.out.println(collect4);

         */


        /*
        // if i want to increment salary by 10%
    //    employeeList.stream().map(e-> (e.salary = e.getSalary()+(e.getSalary()*10/100))).forEach(System.out::println);

         */

        /*

        //  sorting first by name and then by salary this is 2 way
        //  sorting first by name and then by salary this is 2 way
        Comparator<EmployeeTest> byName = (i1,i2)-> i1.getEmpName().compareTo(i2.getEmpName());
    //    Comparator<EmployeeTest> byAge = (a1,a2)-> a1.getAge()-a2.getAge();
        Comparator<EmployeeTest> byAge = (a1,a2)-> a1.getAge().compareTo(a2.getAge());
        employeeList.stream().sorted(byName.thenComparing(byAge)).forEach(System.out::println);

         */




























    }
}
