class Solution {
    int missingNum(int arr[]) {
        //solved
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;

        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }

        return(int) (sum - arraySum);
    }
}
