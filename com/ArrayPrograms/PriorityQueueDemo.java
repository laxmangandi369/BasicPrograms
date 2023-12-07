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
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // remove() & poll() method removes head of the element
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
