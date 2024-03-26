class Solution {
    fun maxProfit(prices: IntArray): Int {
        var mx = 0;
        var mn = prices[0];
        for (p in prices) {
            mn = mn.coerceAtMost(p);
            mx = mx.coerceAtLeast(p - mn);
        }
        return mx
    }
}