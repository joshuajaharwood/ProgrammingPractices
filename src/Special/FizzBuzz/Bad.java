package Special.FizzBuzz;

/**
 * A bad implementation of the Fizz Buzz problem.
 *
 * 3 becomes "Fizz"
 * 5 becomes "Buzz"
 * Both becomes "FizzBuzz"
 * Else, output the number.
 *
 * @author Joshua Harwood
 * @version 0.5
 */

public class Bad {
    /**
     * Performs FizzBuzz.
     *
     * @param nums An array of integers.
     * @return A string array with FizzBuzz results as defined above.
     */
    public static String[] FizzBuzz(int[] nums) {
        String[] results = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (nums[i] % 5 == 0) {
                results[i] = "Buzz";
            } else if (nums[i] % 3 == 0) {
                results[i] = "Fizz";
            } else {
                results[i] = Integer.toString(nums[i]);
            }
        }
        return results;
    }
}