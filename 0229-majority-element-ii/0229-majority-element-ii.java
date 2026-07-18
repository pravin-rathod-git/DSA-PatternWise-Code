class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        // Two potential majority candidates
        int candidate1 = 0;
        int candidate2 = 0;

        // Vote counts for the candidates
        int count1 = 0;
        int count2 = 0;

        // Step 1: Find the two potential candidates
        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                // Reduce votes of both candidates
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
        }

        // Step 3: Add valid majority elements
        List<Integer> ans = new ArrayList<>();

        if (count1 > n / 3) {
            ans.add(candidate1);
        }

        if (count2 > n / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}