package MissingInt;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int length = 100000;
        int missing = 12345;

        // 1-100,000 array, 12345 missing.
        int[] longest = new int[length - 1];
        for (int i = 1; i < missing; i++) {
            longest[i - 1] = i;
        }
        for (int i = missing; i < length; i++) {
            longest[i - 1] = i + 1;
        }

        System.out.println("Longest: " + s.solution(longest));
    }
}
