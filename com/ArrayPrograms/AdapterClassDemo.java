package com.ArrayPrograms;

interface Intref {
    public void m1();
    public void m2();
    public void m3();
    public void m4();
    public void m5();
    public void m6();
    public void m7();
    public void m8();
    public void m9();
    public void m10();
}

abstract class Adapter implements Intref {
    // providing the empty implementation
    public void m1(){};
    public void m2(){};
    public void m3(){};
    public void m4(){};
    public void m5(){};
    public void m6(){};
    public void m7(){};
    public void m8(){};
    public void m9(){};
    public void m10(){};
}

public class AdapterClassDemo extends Adapter {
    @Override
    public void m1(){
        System.out.println("This is m1() method.");
    }
    @Override
    public void m7(){
        System.out.println("This is m7() method.");
    }
    public static void main (String[] args) {
        AdapterClassDemo g = new AdapterClassDemo();
        g.m1(); // This is m1() method.
        g.m7(); // This is m7() method.
    }
}
