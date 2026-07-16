class Solution {
    public int maxSubArray(int[] nums) {

        // Stores the current subarray sum
        int sum = 0;

        // Stores the maximum subarray sum found so far
        int maxSum = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Add the current element to the running sum
            sum += nums[i];

            // Update the maximum sum if needed
            maxSum = Math.max(maxSum, sum);

            // If the running sum becomes negative,
            // discard it and start a new subarray
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}