public class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum = nums[0];  // Start with the first element
        int max_sum = nums[0];  // Initialize the max_sum with the first element
        
        for (int i = 1; i < nums.length; i++) {
            // Update current_sum: either start a new subarray or extend the current one
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            
            // Update max_sum if the current_sum is greater
            max_sum = Math.max(max_sum, current_sum);
        }
        
        return max_sum;
    }
}