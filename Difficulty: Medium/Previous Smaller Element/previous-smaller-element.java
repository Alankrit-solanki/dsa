import java.util.*;

class Solution {
    public ArrayList<Integer> prevSmaller(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove greater or equal elements
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // Previous Smaller Element
            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }

            // Push current element
            st.push(arr[i]);
        }

        return ans;
    }
}