package tn.zelda.projects.java8.datastructure.priorityqueue.object;

import java.util.PriorityQueue;

public class PriorityQueueUserDefinedObjectExample {
    public static void main(String[] args) {
        /*
           The requirement for a PriorityQueue of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the PriorityQueue.
        */

        // Create a PriorityQueue
        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();

        // Add items to the Priority Queue
        employeePriorityQueue.add(new Employee("Rajeev", 100000.00));
        employeePriorityQueue.add(new Employee("Chris", 145000.00));
        employeePriorityQueue.add(new Employee("Andrea", 115000.00));
        employeePriorityQueue.add(new Employee("Jack", 167000.00));

        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
        */
        while (!employeePriorityQueue.isEmpty()) {
            System.out.println(employeePriorityQueue.remove());
        }
    }
}
