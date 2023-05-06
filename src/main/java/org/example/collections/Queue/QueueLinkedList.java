package org.example.collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        integers.offer(2);
        integers.offer(7);
        integers.offer(9);
        integers.offer(1);
        integers.add(11);
        integers.add(13);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);

        System.out.println(list1.hashCode()==list.hashCode());

//        Retrieves and removes the head of this queue, or returns null if this queue is empty
        System.out.println("Poll function " + integers.poll());
        //Retrieves head of the queue
        System.out.println(integers.peek());
        //Check weather object contains or not in queue
        System.out.println(integers.contains(13));
        System.out.println(integers.remove(9));
        System.out.println(integers.stream().findFirst());
        System.out.println(integers);
    }
    }
