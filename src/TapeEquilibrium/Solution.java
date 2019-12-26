package TapeEquilibrium;

public class Solution {
    /**
     * [3 ¦ 1, 2, 4, 3]
     * (3, 10) = 7
     * [3, 1, ¦ 2, 4, 3]
     * (4, 9)
     * [3, 1, 2, ¦ 4, 3]
     * (6, 7)
     * [3, 1, 2, 4, ¦ 3]
     * (10, 3)
     */

    /**
     * [-10, ¦ -20, -30, -40, 100]
     * (-10, 10) = 20
     * [-10, -20, ¦ -30, -40, 100]
     * (-30, 30) = 60
     * [-10, -20, -30, ¦ -40, 100]
     * (-60, 60) = 120
     * [-10, -20, -30, -40, ¦ 100]
     * (-100, 100) = 200
     */
    public int solution(int[] A) {
        // get first pair...
        // head = [0]
        long head = A[0];

        // tail = sum([1 -> n])
        long tail = 0;
        for (int element : A){
            tail += element;
        }
        tail -= head;

        // if 2 values, just do abs calc
        if (A.length == 2) {
            return (int) Math.abs(tail - head);
        }

        // first difference
        long diff = Math.abs(tail - head);

        // 1 -> n diffs
        for (int i = 1; i < A.length - 1; i++) {
            // advance pairings around pivot
            head += A[i];
            tail -= A[i];

            // if new diff is smaller, reassign it.
            if (Math.abs(tail - head) < diff) {
                diff = Math.abs(tail - head);
            }

//            System.out.println("Head " + head);
//            System.out.println("Tail " + tail);
//            System.out.println("Diff " + diff);

        }
        return (int) diff;
    }
}
