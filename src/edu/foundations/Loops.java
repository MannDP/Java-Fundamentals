package edu.foundations;

public class Loops {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
    }

    public static void forLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        return;
    }

    public static void whileLoop() {
        Boolean done = false;
        int i = 1;

        while(!done) {
            System.out.println(i);
            ++i;

            if (i > 10) {
                done = true;
            }
        }

        return;
    }
}
