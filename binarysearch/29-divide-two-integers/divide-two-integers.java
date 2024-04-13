class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // dividend  = Math.abs((long) dividend);
        // divisor  = Math.abs((long) divisor);
        int div = dividend / divisor;
        return div;
    }
}