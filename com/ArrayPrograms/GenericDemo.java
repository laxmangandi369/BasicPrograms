package com.ArrayPrograms;

import java.util.ArrayList;

public class GenericDemo <T>{

    T obj; // obj is T-type & T is any type based on our runtime provided.

    public GenericDemo(T obj) {
        this.obj = obj;
    }

    public void show(){
        System.out.println("The type of obj : "+ obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
    // the main objective of generics is to provide the type safety & to resolve type-casting problem.

    public static void main(String[] args) {
        /*
        // without generic we are declaring ArraList like this way
        ArrayList al = new ArrayList();
        */

        /*
        // with generic we can declare Arraylist like this way
        ArrayList<Integer> arrayList = new ArrayList<>(); // valid declartion
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); // valid declaration
        */

        GenericDemo<String> g1 = new GenericDemo<String>("durga");
        g1.show(); // The type of obj : java.lang.String
        System.out.println(g1.getObj()); // durga


        GenericDemo<Integer> g2 = new GenericDemo<Integer>(10);
        g2.show(); // The type of obj : java.lang.Integer
        System.out.println(g2.getObj()); // 10
    }

}
