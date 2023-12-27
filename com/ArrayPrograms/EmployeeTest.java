package com.ArrayPrograms;

public class EmployeeTest {

    private Integer empId;
    private String empName;
    Integer salary;
    private Integer age;
    private String city;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EmployeeTest(Integer empId, String empName, Integer salary, Integer age, String city) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
