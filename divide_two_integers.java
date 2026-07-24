class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long dd = Math.abs((long) dividend);
        long dr = Math.abs((long) divisor);
        int ans = 0;
        while (dd >= dr) {
            long temp = dr;
            int multiple = 1;
            while (dd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dd -= temp;
            ans += multiple;
        }
        if ((dividend < 0) ^ (divisor < 0)) {
            return -ans;
        }
        return ans;
    }
}
