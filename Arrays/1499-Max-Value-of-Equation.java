class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
     Deque<Integer> dq = new ArrayDeque<>();
        int big = Integer.MIN_VALUE;

        for (int j = 0; j < points.length; j++) {

            int xj = points[j][0];
            int yj = points[j][1];

            // Remove points whose x difference is greater than k
            while (!dq.isEmpty() &&
                   xj - points[dq.peek()][0] > k) {
                dq.poll();
            }

            // Calculate answer
            if (!dq.isEmpty()) {
                int i = dq.peek();

                int ans = points[i][1] - points[i][0]
                        + yj + xj;

                if (ans > big) {
                    big = ans;
                }
            }

            // Keep the best (y - x) at the front
            while (!dq.isEmpty() &&
                   points[dq.peekLast()][1] - points[dq.peekLast()][0]
                   <= yj - xj) {
                dq.pollLast();
            }

            dq.add(j);
        }

        return big;
    }
}