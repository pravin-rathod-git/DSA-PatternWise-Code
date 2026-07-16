class Solution {
    public int majorityElement(int[] nums) {

        // Assume the first element is the majority candidate
        int major = nums[0];
        int count = 1;

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {

            // Same as current candidate
            if (nums[i] == major) {
                count++;
            } 
            // Different element
            else {
                count--;

                // If count becomes 0,
                // choose the current element as the new candidate
                if (count == 0) {
                    major = nums[i];
                    count = 1;
                }
            }
        }

        // The remaining candidate is the majority element
        return major;
    }
}