class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle cases where k is greater than array size
        k = k % n;

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    public void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}