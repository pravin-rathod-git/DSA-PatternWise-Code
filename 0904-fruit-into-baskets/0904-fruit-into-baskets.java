class Solution {
    public int totalFruit(int[] fruits) {

        // Map to store fruit type and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        // Expand the window
        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to the map
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types, shrink the window
            while (map.size() > 2) {

                // Reduce frequency of left fruit
                map.put(fruits[left], map.get(fruits[left]) - 1);

                // Remove fruit type if frequency becomes 0
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                // Move left pointer
                left++;
            }

            // Update maximum valid window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}