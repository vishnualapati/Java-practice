package org.example.collections.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(999);
        set.add(1);
        set.add(5);
        set.add(78);

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set);

    }
}
