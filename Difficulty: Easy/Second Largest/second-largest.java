class Solution {
    public int getSecondLargest(int[] arr) {
//solved
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        int Secondmax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > Secondmax && arr[i] != max)
                Secondmax = arr[i];
        }

        return (Secondmax == Integer.MIN_VALUE) ? -1 : Secondmax;
    }
}
