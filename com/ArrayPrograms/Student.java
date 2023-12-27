package com.ArrayPrograms;

public class Student implements Comparable<Student>{
    // if we want to implement Comparable first we need implement Comparable interface

    private Integer id;
    private Integer rollNo;
    private String name;
    private String designation;
    private Double salary;

    public Student(Integer id, Integer rollNo, String name, String designation, Double salary) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Student o) {
      //  return this.rollNo - o.rollNo; // this will sort according to rollno
            return this.getId().compareTo(o.getId());
    }
}
