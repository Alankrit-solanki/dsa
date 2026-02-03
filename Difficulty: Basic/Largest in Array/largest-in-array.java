class Solution {
    public static int largest(int[] arr) {
        int max = arr[0];
//solved
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
