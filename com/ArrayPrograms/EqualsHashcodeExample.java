package com.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcodeExample {
    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "durga");
        Employee employee2 = new Employee(101, "durga");

        System.out.println(employee1.equals(employee2));// it will return false for default implementation
        // for equals() and hashcode()
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee1.hashCode() == employee2.hashCode());

        Set<Employee> employeeSet = new HashSet<Employee>(); // and also it allowing me
        // to add duplicate objects if we go with
        // default implementation i.e if we are overriding hashcode & equals method.
        employeeSet.add(employee1);
        employeeSet.add(employee2);

        for (Employee employee : employeeSet) {
            System.out.println(employee.getRollNo() + "=" + employee.getName());
        }

        // just for example to showcase the behaviour of HashSet weather it is allowing
        // duplicate objects adding in HashSet object or not
        Set<Object> objectSet = new HashSet<>();
        objectSet.add("durga");
        objectSet.add("durga");

        for (Object obj : objectSet) {
            System.out.println(obj.toString());
        }


    }
}
