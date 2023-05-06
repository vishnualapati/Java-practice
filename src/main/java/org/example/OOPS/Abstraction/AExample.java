package org.example.OOPS.Abstraction;

public interface AExample {
    int sum(int a, int b);

    double power(double a, double b);
}

interface AExample1 extends AExample{
    int subtraction(int a, int b);

    int multiply(int a, int b);

}
