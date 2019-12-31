package Special.FizzBuzz;

/**
 * A better implementation of the Fizz Buzz problem.
 *
 * 3 becomes "Fizz"
 * 5 becomes "Buzz"
 * Both becomes "FizzBuzz"
 * Else, output the number.
 *
 * @author Joshua Harwood
 * @version 1.0
 */

public class Better {
    /**
     * Performs FizzBuzz.
     *
     * Using DRY principles, we have prevented repetition by making our divisibility checks in to
     * boolean expressions.
     * @param nums An array of integers.
     * @return A string array with FizzBuzz results as defined above.
     */
    public static String[] FizzBuzz(int[] nums) {
        String[] results = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            boolean div3 = nums[i] % 3 == 0;
            boolean div5 = nums[i] % 5 == 0;

            if (div3 && div5) results[i] = "FizzBuzz";
            else if (div5) results[i] = "Buzz";
            else if (div3) results[i] = "Fizz";
            else results[i] = Integer.toString(nums[i]);
        }

        return results;
    }
}