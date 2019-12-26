package RotateArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] x = new int[]{1, 2, 3, 4, 5, 6};
        int[] empty = new int[]{};

        System.out.println(Arrays.toString(s.solution(empty, 2)));
    }
}
