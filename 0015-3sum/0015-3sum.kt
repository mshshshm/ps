class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var left: Int
        var right: Int
        var sum: Int
        val results: MutableList<List<Int>> = mutableListOf()
        val results2: MutableSet<List<Int>> = mutableSetOf()
        Arrays.sort(nums)
        
        for (i in 0 until nums.size - 2) {
            left = i + 1;
            right = nums.size - 1;    
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right]
                if (sum<0)
                    left += 1;
                else if (sum > 0)
                    right -= 1;
                else {
                    results2.add(listOf(nums[i], nums[left], nums[right]))
                    
                    left += 1;
                    right -=1;
                }
            }
                
        }
        return results2.toList()
    }
}