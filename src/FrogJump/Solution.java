package FrogJump;

public class Solution {
    public int solution(int X, int Y, int D) {
        // formula: remaining steps / step number
        int remaining = Y - X;

        if (remaining % D == 0) {
            // if no remainder
            return remaining / D;
        } else {
            // if there's a remainder
            return remaining / D + 1;
        }
    }
}
