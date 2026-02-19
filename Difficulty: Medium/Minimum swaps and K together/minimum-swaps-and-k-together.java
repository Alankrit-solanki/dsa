class Solution {
    int minSwap(int[] arr, int k) {
        int n = arr.length;
        
        int count = 0;
        for (int num : arr) {
            if (num <= k) count++;
        }
        
        if (count == 0) return 0;
        
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) bad++;
        }
        
        int minSwaps = bad;
        
        for (int i = 0, j = count; j < n; i++, j++) {
            if (arr[i] > k) bad--;
            if (arr[j] > k) bad++;
            minSwaps = Math.min(minSwaps, bad);
        }
        
        return minSwaps;
    }
}
