package RotateArray;

import java.lang.System;

public class Solution {

    public int[] solution(int[] A, int K) {
        int[] x = A;
        for (int j = 0; j < K; j++)
            x = rotateOnce(x);
        return x;
    }

    private int[] rotateOnce(int[] A) {
        // concatenate in to new array
        int[] concat = new int[A.length];
        int last = A[A.length - 1];

        // get last element
        concat[0] = last;

        System.arraycopy(A, 0, concat, 1, A.length - 1);
        return concat;
    }
}
