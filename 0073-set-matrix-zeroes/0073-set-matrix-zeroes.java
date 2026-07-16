class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Indicates whether the first column should be zeroed
        boolean firstCol = false;

        // First pass: use first row and first column as markers
        for (int i = 0; i < m; i++) {

            // Check if first column contains any zero
            if (matrix[i][0] == 0) {
                firstCol = true;
            }

            for (int j = 1; j < n; j++) {

                if (matrix[i][j] == 0) {

                    // Mark corresponding row
                    matrix[i][0] = 0;

                    // Mark corresponding column
                    matrix[0][j] = 0;
                }
            }
        }

        // Second pass: update cells using markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // If first row needs to be zero
        if (matrix[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // If first column needs to be zero
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}