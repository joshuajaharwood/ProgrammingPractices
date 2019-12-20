package BinaryGap;

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);

        int highestCount = 0, currentCount = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);

            if (bit == '0') {
                currentCount++;
            } else {
                if (currentCount > highestCount) {
                    highestCount = currentCount;
                }
                currentCount = 0;
            }
        }
        return highestCount;
    }
}