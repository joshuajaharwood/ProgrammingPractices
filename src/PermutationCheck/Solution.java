package PermutationCheck;

import java.util.HashMap;

public class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // get max value
        int max = 0;
        for (int element : A) {
            if (element > max) {
                max = element;
            }
        }

        // create hashmap of all elements
        for (int element : A) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        // check for nonexistent keys
        for (int i = 1; i <= max; i++) {
            if (!map.containsKey(i)) {
                return 0;
            } else if (map.get(i) > 1) {
                return 0;
            }
        }
        return 1;
    }
}
