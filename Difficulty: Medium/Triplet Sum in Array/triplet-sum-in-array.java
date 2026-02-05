import java.util.*;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i = 0; i < n - 2; i++) {
            
            int first = i + 1;
            int last = n - 1;
            
            while(first < last) {
                
                int sum = arr[i] + arr[first] + arr[last];
                
                if(sum == target) {
                    return true;
                }
                else if(sum < target) {
                    first++;   // move forward
                }
                else {
                    last--;    // move backward
                }
            }
        }
        
        return false;
    }
}
