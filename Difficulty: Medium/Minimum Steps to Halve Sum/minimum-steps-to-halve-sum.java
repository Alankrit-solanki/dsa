import java.util.*;

class Solution {
    public int minOperations(int[] arr) {

        PriorityQueue<Double> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;

        // Calculate total sum and add elements to max heap
        for (int x : arr) {
            sum += x;
            pq.offer((double) x);
        }

        double target = sum / 2.0;
        double current = sum;

        int operations = 0;

        // Keep halving the maximum element
        while (current > target) {

            double largest = pq.poll();

            double half = largest / 2.0;

            current -= half;

            pq.offer(half);

            operations++;
        }

        return operations;
    }
}