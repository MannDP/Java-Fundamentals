package com.statistics;

import static com.statistics.BubbleSort.sortBubbleArray;
import static com.statistics.populateArray.popDataArray;
import static com.statistics.arrayPrint.printArray;

public class Mode {
    public static void main(String[] args) {
        System.out.println("Welcome to the Mean, Median, Mode Calculator");
        System.out.println("");

        float[] dataset = new float [args.length];
        popDataArray(args, dataset);
        sortBubbleArray(dataset, dataset.length);

        //quick smoke test on numModes, and maxNumRepeats values
        //printArray(dataset);
        //System.out.println(numRepeats(dataset, dataset.length));
        //System.out.println(numModes(dataset, dataset.length));

        float[] modes = new float[numModes(dataset, dataset.length)];
        //System.out.println(modes.length);

        modeArray(modes, dataset);
        printArray(modes);
    }

    public static int numRepeats(final float[] dataset, final int size) {

        int maxNumRepeats = 1;
        int curRepeats = 1;

        for (int i = 0; i < (size-1); i++) {

            float valCur = dataset[i];
            float valNext = dataset[i+1];

            if (valCur == valNext) {
                curRepeats++;
            }

            else {
                curRepeats = 1;
            }

            if (curRepeats > maxNumRepeats) {
                maxNumRepeats = curRepeats;
            }
        }

        return maxNumRepeats;
    }

    public static int numModes (final float[] dataset, final int size) {
        int numModes = 1;
        int maxRepeats = numRepeats(dataset, size);
        int curRepeats = 1;

        for (int i = 0; i < (size-1); i++) {
            float valCur = dataset[i];
            float valNext = dataset[i+1];

            if (valCur == valNext) {
                curRepeats++;
            }

            else {
                curRepeats = 1;
            }

            if (curRepeats >= maxRepeats) {
                ++numModes;
            }
        }

        if (maxRepeats != 1) {
            --numModes;
        }

        return numModes;
    }

    //need to populate the array of modes here
    public static boolean modeArray (float[] foo, final float[] dataset) {
        int maxRepeats = numRepeats(dataset, dataset.length);
        int curRepeats = 1;
        int modeIndex = 0;

        for (int i = 0; i < (dataset.length-1); i++) {

            float valCur = dataset[i];
            float valNext = dataset[i+1];

            if (valCur == valNext) {
                curRepeats++;
            }

            else {
                curRepeats = 1;
            }

            if (curRepeats >= maxRepeats) {
                foo[modeIndex] = valCur;
                modeIndex++;
            }
        }

        return true;
    }
}