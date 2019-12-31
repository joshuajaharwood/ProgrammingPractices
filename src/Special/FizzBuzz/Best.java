package Special.FizzBuzz;

/**
 * A better implementation still, of the Fizz Buzz problem.
 *
 * 3 becomes "Fizz"
 * 5 becomes "Buzz"
 * Both becomes "FizzBuzz"
 * Else, output the number.
 *
 * @author Joshua Harwood
 * @version 2.0
 */
public class Best {
    /**
     * Performs FizzBuzz.
     *
     * The divisibility check has been moved to a private function for better code reusability.
     * @param nums An array of integers.
     * @return A string array with FizzBuzz results as defined above.
     */
    public static String[] FizzBuzz(int[] nums) {
        String[] results = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            boolean div3 = isDivisible(nums[i], 3);
            boolean div5 = isDivisible(nums[i], 5);

            if (div3 && div5) results[i] = "FizzBuzz";
            else if (div5) results[i] = "Buzz";
            else if (div3) results[i] = "Fizz";
            else results[i] = Integer.toString(nums[i]);
        }
        return results;
    }

    private static boolean isDivisible(int n, int d) {
        return n % d == 0;
    }
}