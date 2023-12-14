package com.ArrayPrograms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
// in PriorityQueue we can insert at the end & removal will happen at beginning.
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("john");
        queue.add("smith");
        queue.add("orlen");
        queue.add("charles");
        System.out.println("printing elements of priority queue "+ queue);

        System.out.println("peek() returns the top of the element by using element() = " + queue.element());// element() will give peek of the element
        System.out.println("peek() returns the top of the element = " + queue.peek());


        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // remove() & poll() method removes head of the element
        queue.remove();
        System.out.println("remove() removes the head of the element " + queue);
        queue.poll();
        System.out.println("poll() method removes the head of the element = " + queue);
    }
}
