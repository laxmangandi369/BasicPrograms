package com.ArrayPrograms;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
// Difference between normal Queue & ArrayDequeue insertion will at the end of queue
// & removal will happen at the beginning of queue, when you go for ArrayDequeue insertion
// & removal will happen from both sides of queue.
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.add("one");
        ad.add("two");
        ad.add("three");
        ad.addFirst("ashok");
        System.out.println(ad);

        ad.pollFirst();
        System.out.println(ad);

        ad.pollLast();
        System.out.println(ad);
    }
}
