class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        // Stores the frequency of elements in the current window
        HashMap<Integer, Integer> map = new HashMap<>();

        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        // Expand the window
        for (int right = 0; right < nums.length; right++) {

            // Add the current element to the window sum
            windowSum += nums[right];

            // Increase its frequency
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Shrink the window if its size becomes greater than k
            if (right - left + 1 > k) {

                // Remove the leftmost element from the sum
                windowSum -= nums[left];

                // Decrease its frequency
                map.put(nums[left], map.get(nums[left]) - 1);

                // Remove the element from the map if frequency becomes 0
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                // Move the left pointer
                left++;
            }

            // If window size is exactly k and all elements are distinct
            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}