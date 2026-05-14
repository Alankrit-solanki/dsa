// User function Template for Java

class Solution {
    public int[] createFootpath(int n, int m, int a[][], int q, int queries[][]) {

        // Store minimum values for 4 regions
        int[][] topLeft = new int[n][m];
        int[][] topRight = new int[n][m];
        int[][] bottomLeft = new int[n][m];
        int[][] bottomRight = new int[n][m];

        // Top Left
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int mn = a[i][j];

                if (i > 0)
                    mn = Math.min(mn, topLeft[i - 1][j]);

                if (j > 0)
                    mn = Math.min(mn, topLeft[i][j - 1]);

                topLeft[i][j] = mn;
            }
        }

        // Top Right
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {

                int mn = a[i][j];

                if (i > 0)
                    mn = Math.min(mn, topRight[i - 1][j]);

                if (j < m - 1)
                    mn = Math.min(mn, topRight[i][j + 1]);

                topRight[i][j] = mn;
            }
        }

        // Bottom Left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {

                int mn = a[i][j];

                if (i < n - 1)
                    mn = Math.min(mn, bottomLeft[i + 1][j]);

                if (j > 0)
                    mn = Math.min(mn, bottomLeft[i][j - 1]);

                bottomLeft[i][j] = mn;
            }
        }

        // Bottom Right
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int mn = a[i][j];

                if (i < n - 1)
                    mn = Math.min(mn, bottomRight[i + 1][j]);

                if (j < m - 1)
                    mn = Math.min(mn, bottomRight[i][j + 1]);

                bottomRight[i][j] = mn;
            }
        }

        int[] ans = new int[q];

        // Process Queries
        for (int k = 0; k < q; k++) {

            int r = queries[k][0] - 1;
            int c = queries[k][1] - 1;

            int sum = 0;

            // Top Left section
            if (r > 0 && c > 0)
                sum += topLeft[r - 1][c - 1];

            // Top Right section
            if (r > 0 && c < m - 1)
                sum += topRight[r - 1][c + 1];

            // Bottom Left section
            if (r < n - 1 && c > 0)
                sum += bottomLeft[r + 1][c - 1];

            // Bottom Right section
            if (r < n - 1 && c < m - 1)
                sum += bottomRight[r + 1][c + 1];

            ans[k] = sum;
        }

        return ans;
    }
}