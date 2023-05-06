package org.example.OOPS.Inheritance;

public class AInheritance {
     String name;
     int rollNo;

    public AInheritance(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    String printInfo() {
        return "Name " + name + "rollNo "+ rollNo;
    }

     void run() {
        System.out.println("Running..");
    }
}
