class Solution {
    public int median(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < r; i++) {
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][c - 1]);
        }
        
        int desired = (r * c + 1) / 2;
        
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            
            for (int i = 0; i < r; i++) {
                place += upperBound(mat[i], mid);
            }
            
            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        
        return min;
    }
    
    private int upperBound(int[] row, int target) {
        int low = 0, high = row.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        
        return low;
    }
}
