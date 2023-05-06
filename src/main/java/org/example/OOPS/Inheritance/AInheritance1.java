package org.example.OOPS.Inheritance;

public class AInheritance1  extends  AInheritance{
    String phoneNo;

    AInheritance1(String name, int rollNo, String phoneNo) {
        super(name, rollNo);
        this.phoneNo  = phoneNo;

    }
    String printInfo() {
        return super.printInfo() + "phomeNo "+ phoneNo;
    }

    @Override
    void run() {
        System.out.println("Running in subclass..");
    }

    public static void main(String[] args) {
        AInheritance1 aInheritance1 = new AInheritance1("vishnu", 1, "2345");
        System.out.println(aInheritance1.printInfo());
        aInheritance1.run();
    }
}
