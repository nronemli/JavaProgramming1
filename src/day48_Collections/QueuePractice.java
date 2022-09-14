package day48_Collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        //random output does not maintain order
        Queue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("priorityQueue = " + priorityQueue);
        //returns first element
       System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue.peek());
        //keeps insertion order
        Queue<Integer> arrayDequeue= new ArrayDeque<>();
        arrayDequeue.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("arrayDequeue = " + arrayDequeue);
        System.out.println(arrayDequeue.poll()); //10
        System.out.println(arrayDequeue.poll()); //200
        System.out.println(arrayDequeue.peek()); //300








    }
}
