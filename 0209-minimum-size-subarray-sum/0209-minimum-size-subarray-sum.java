class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int left = 0;          // Left pointer of the window
        int sum = 0;           // Current window sum
        int minLength = Integer.MAX_VALUE;

        // Expand the window
        for (int right = 0; right < n; right++) {

            sum += nums[right];

            // Shrink the window while the sum is sufficient
            while (sum >= target) {

                // Update the minimum window length
                minLength = Math.min(minLength, right - left + 1);

                // Remove the leftmost element
                sum -= nums[left];

                // Move the left pointer forward
                left++;
            }
        }

        // If no valid subarray exists, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}