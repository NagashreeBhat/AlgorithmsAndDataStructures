//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[b] == target - nums[a]) {
                    return new int[] { a, b };
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
