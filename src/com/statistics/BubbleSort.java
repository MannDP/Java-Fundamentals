package com.statistics;

public class BubbleSort {
    public static void sortBubbleArray(float[] foo, final int n) {
        int i, j;
        for (i = 0; i < n; ++i)
        {
            for (j = 0; j < n-i-1; ++j)
            {
                if (foo[j] > foo[j+1])
                {
                    foo[j] = foo[j]+foo[j+1];
                    foo[j+1] = foo[j]-foo[j + 1];
                    foo[j] = foo[j]-foo[j + 1];
                }
            }
        }
    }
}
