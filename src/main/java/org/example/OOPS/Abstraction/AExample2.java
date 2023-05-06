package org.example.OOPS.Abstraction;

public class AExample2 implements AExample, AExample1{

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public int subtraction(int a, int b) {
        if(a>b) {
            return a-b;
        } else {
            return b-a;
        }
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
