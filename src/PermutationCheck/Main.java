package PermutationCheck;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] yes = new int[]{4, 1, 3, 2};
        int[] no = new int[]{4, 1, 3};
        int[] two = new int[]{1, 1};

        System.out.println("Return: " + s.solution(two));



    }
}
