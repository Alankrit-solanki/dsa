class Solution {
    public void sortInWave(int arr[]) {
        // solved
        for(int i=0 ;i<arr.length ; i+=2){
            if(i==arr.length -1)break;
        int temp =arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        }
    }
}
