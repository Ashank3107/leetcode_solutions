public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;  // Pointer to track the position of non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];  // Place the element at the correct position
                index++;  // Move the index forward
            }
        }
        
        return index;  // Return the number of elements not equal to val
    }
}