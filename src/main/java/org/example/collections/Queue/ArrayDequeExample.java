package org.example.collections.Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(12);
        arrayDeque.offer(45);
        arrayDeque.addFirst(1);;
        arrayDeque.addFirst(6);
        arrayDeque.peekFirst();
        arrayDeque.peekLast();
        arrayDeque.removeLast();
        arrayDeque.pollFirst();
    }
}
