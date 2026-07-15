class Solution {
    public int removeDuplicates(int[] nums) {

        // j points to the last unique element
        int j = 0;

        // Traverse the array from the second element
        for (int i = 1; i < nums.length; i++) {

            // Found a new unique element
            if (nums[i] != nums[j]) {

                // Move j to the next position
                j++;

                // Place the new unique element here
                nums[j] = nums[i];
            }
        }

        // Number of unique elements
        return j + 1;
    }
}