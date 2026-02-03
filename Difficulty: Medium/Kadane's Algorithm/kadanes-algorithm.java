class Solution {
    int maxSubarraySum(int[] arr) {

        int maxSoFar = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        return maxSoFar;
    }
}

