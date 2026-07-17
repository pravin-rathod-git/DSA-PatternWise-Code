
class Solution {
    public int subarraySum(int[] nums, int k) {

        // Stores: Prefix Sum -> Frequency
        Map<Integer, Integer> map = new HashMap<>();

        // Base case: one prefix sum of 0 before starting
        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int num : nums) {

            // Update running prefix sum
            prefix += num;

            // If (prefix - k) exists, a valid subarray ends here
            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }

            // Store/update the current prefix sum frequency
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}