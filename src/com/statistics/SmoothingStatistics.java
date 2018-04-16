package com.statistics;

public class SmoothingStatistics {
    public static void main(String[] args) {
        System.out.println("Welcome to the Running Statistics Program in Java!");
        System.out.println("");

        final int time = Integer.parseInt(args[0]);
        final float alpha = Float.parseFloat(args[1]);

        float[] dataset = new float [args.length - 2];

        //populate input into dataset, and calculate statistics
        populateArray(args, dataset);
        statsCalc(dataset, time, alpha);
    }

    public static void populateArray(String[] args, float[] foo) {
        for (int i = 0; i < args.length - 2; i++) {
            float tmp = Float.parseFloat(args[i+2]);
            foo[i] = tmp;
        }

        //printArray(foo);
    }

    public static float averageCalculator(float[] foo, final int index) {
        float sum = 0;
        float average;
        for (int i = 0; i < index; i++) {
            sum += foo[i];
        }

        average = sum/(index);
        return average;
    }


    public static void statsCalc(float[] dataArray, final int time, final float alpha) {
        //variables that hold the five basic quantities that will be appended onto the table

        float max = dataArray[0];
        float min = dataArray[0];
        float EWMA = 2;
        int pass = 0;
        float value;

        int minAge = 1;
        int maxAge = 1;

        //initialize the table headings to print the data onto
        System.out.println("Pass" + "\t" + "Value" + "\t" + "Min" + "\t" + "EWMA" + "\t" + "Max");

        for (int i = 0; i < dataArray.length; i++) {
            value = dataArray[i];
            ++pass;

            //if else branch to calculate the maximum; should really be split into it's function... that gets the same
            //input values as stasCalc(...). However, would also need to pass in an index variable... maybe Pass-1 ?
            if (maxAge > time) {
                max = -Float.MAX_VALUE;
                for (int j = i; j > (i-3); j--) {
                    float tmp = dataArray[j];

                    if (tmp >= max) {
                        max = tmp;
                        maxAge = i - j + 1;
                    }
                }
            }

            else {
                if (value >= max) {
                    max = value;
                    maxAge = 1;
                }
            }

            //implement minimum calculation logic
            if (minAge > time) {
                min = Float.MAX_VALUE;
                for (int j = i; j > (i-3); j--) {
                    float tmp = dataArray[j];

                    if (tmp <= min) {
                        min = tmp;
                        minAge = i - j + 1;
                    }
                }
            }

            else {
                if (value <= min) {
                    min = value;
                    minAge = 1;
                }
            }

            //populate EWMA
            if (pass == 1) {
                EWMA = value;
            }

            else {
                EWMA = alpha * value + (1 - alpha) * (averageCalculator(dataArray, pass));
            }

            System.out.println(pass + "\t" + value + "\t" + min + "\t" + EWMA + "\t" + max);
            //System.out.println(pass + "       " + value + "     " + min + "  " + EWMA + "    " + max);

            ++maxAge;
            ++minAge;
        }


    }

    public static void printArray(float[] foo) {
        for (int i = 0; i < foo.length; i++) {
            System.out.println(foo[i]);
        }
    }
}
