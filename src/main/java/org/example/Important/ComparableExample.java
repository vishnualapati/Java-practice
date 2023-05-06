package org.example.Important;

import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int mobile;

    public int getMobile() {
        return mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name, int mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    static Comparator<Employee> comparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.getId() - o1.getId();
        }
    };

    static Comparator<Employee> doubleComoare = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getMobile() - o2.getMobile();
        }
    };
}
public class ComparableExample {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "vishnu", 123));
        list.add(new Employee(2, "Alapati", 456));
        list.add(new Employee(3, "Arjun", 678));
        list.add(new Employee(4, "vardhan", 908));
        list.add(new Employee(5, "srii",342));
        list.add(new Employee(7, "vishnu",123));

//        Iterator<Employee> i = list.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
        System.out.println("before sorting-- "+ list);
        Collections.sort(list);
        System.out.println("after sorting-- "+ list);
        Collections.sort(list, Employee.comparator);
        System.out.println("== "+ list);
    }
}
