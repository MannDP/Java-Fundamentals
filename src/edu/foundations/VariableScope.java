package edu.foundations;

//static variables are called class variables in java when they are declared outside any method, like x
//variables declared inside methods are called local variables. Once the compiler has finished executing the method, it wipes the stack and thus the variable is lost
public class VariableScope {
    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println(x);

        doSomething();
        System.out.println(x);
    }

    static void doSomething() {
        x = 10;
    }

    static void localVariable () {
        int y;
        y = 100;
    }
}
