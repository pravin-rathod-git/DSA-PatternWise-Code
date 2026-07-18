
class Solution {
    public List<List<Integer>> generate(int numRows) {

        // Stores the final Pascal's Triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // Generate each row
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // Fill the current row
            for (int j = 0; j <= i; j++) {

                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements are the sum of the two elements above
                    int value = triangle.get(i - 1).get(j - 1)
                              + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }

            // Add the completed row to the triangle
            triangle.add(row);
        }

        return triangle;
    }
}