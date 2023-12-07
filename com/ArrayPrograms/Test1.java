package com.ArrayPrograms;

class C{
    void m1()
    {
        System.out.println("In m1 A");
    }
}
class D extends C{
    void m1()
    {
        System.out.println("In m1 B");
    }
    void m2()
    {
        System.out.println("In m1 B");
    }
}
public class Test1 {

    public static void main(String[] args) {
        C c = new D();
      //  c.m2(); // it is compile time error due to m2() is not present in class C
        c.m1(); // In m1 B
    }
}
