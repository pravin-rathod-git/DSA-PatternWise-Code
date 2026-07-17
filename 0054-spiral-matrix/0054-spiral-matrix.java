import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Define the four boundaries
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        // Continue until all elements are visited
        while (top <= bottom && left <= right) {

            // 1. Traverse from Left -> Right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // 2. Traverse from Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // 3. Traverse from Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4. Traverse from Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}