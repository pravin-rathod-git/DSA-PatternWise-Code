class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        // If k is 0 or 1, no positive product can be less than k
        if (k <= 1) {
            return 0;
        }

        int left = 0;          // Left pointer of the sliding window
        long product = 1;      // Stores the product of the current window
        int count = 0;         // Stores the total number of valid subarrays

        // Expand the window by moving the right pointer
        for (int right = 0; right < nums.length; right++) {

            // Include the current element in the product
            product *= nums[right];

            // Shrink the window until the product becomes less than k
            while (product >= k) {
                product /= nums[left];
                left++;
            }

            // All subarrays ending at 'right' and starting
            // from 'left' to 'right' are valid
            count += (right - left + 1);
        }

        return count;
    }
}