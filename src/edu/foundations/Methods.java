package edu.foundations;

public class Methods {
    public static void main(String[] args) {
        sayHelloWorld();
        //sum (5, 7);
        sayHelloTo("John");
        sayHelloTo("Kathan");
        sayHelloTo("Roger");

        System.out.println(returnInteger() + " squared is: " + squareNumber(returnInteger()));
    }

    //my first method
    static void sayHelloWorld() {
        System.out.println("Hello, World");
    }

    static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }

    //input and output, simple addition method
    static int sum (int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    static int returnInteger() {
        return 15;
    }

    static int squareNumber(int a) {
        return a*a;
    }
}
