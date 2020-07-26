package tn.zelda.projects.java8.datastructure.priorityqueue;

import java.util.PriorityQueue;

/**
 A priority queue in Java is a special type of queue wherein all the elements are ordered as per
 their natural ordering or based on a custom Comparator supplied at the time of creation.

 The front of the priority queue contains the least element according to the specified ordering,
 and the rear of the priority queue contains the greatest element.
 */
public class PriorityQueueSample {


    public static void main(String[] args) {
        PriorityQueue<Integer> queue =  new PriorityQueue<Integer>();
        queue.add(900);
        queue.add(100);
        queue.add(300);
        queue.add(150);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
