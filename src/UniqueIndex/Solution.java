package UniqueIndex;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int element : A) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
