package com.statistics;

public class populateArray {
    public static void popDataArray (String[] args, float[] foo) {
        for (int i = 0; i < args.length; i++) {
            float tmp = Float.parseFloat(args[i]);
            foo[i] = tmp;
        }
    }
}
