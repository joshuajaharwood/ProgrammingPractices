package MissingInt;

public class Solution {
    public int solution(int[] A) {
        // MUST BE LONGS!
        // get highest value
        long n = A.length + 1;

        // get total of elements summed below n
        long total = n * (n + 1) / 2;

        System.out.println("Total: " + total);

        // subtract for missing element
        for (int element : A) {
            total -= element;
        }

        return (int) total;
    }
}
