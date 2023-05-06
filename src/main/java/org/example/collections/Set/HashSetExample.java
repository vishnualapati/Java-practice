package org.example.collections.Set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<List<Integer>> set = new HashSet<>();
//        set.add(1);
//        set.add(12);
//        set.add(13);
//        set.add(13);
//        set.add(15);
//        set.add(3);
//        set.add(5);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);

        set.add(list1);
        set.add(list);

        System.out.println(set.size());

//        Iterator<Integer> itr = set.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        System.out.println(set);

    }
}
