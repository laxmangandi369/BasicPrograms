package com.ArrayPrograms;

import java.util.Objects;

public class Employee {

    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(name, other.name) && rollNo == other.rollNo;
    }
}
