class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        var res = 0
        nums.sort()
        
        for ((i, n) in nums.withIndex()) {
            if (i % 2 == 0)
                res += n
        }
        return res
    }
}