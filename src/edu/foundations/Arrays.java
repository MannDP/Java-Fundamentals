package edu.foundations;

public class Arrays {
    public static void main(String[] args) {

        int[] dataArray = new int[50000];

        System.out.println("dataArray.length is: " + dataArray.length);

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = i;
        }

        for (int i : dataArray) {
            System.out.println(i);
        }

    }
}
