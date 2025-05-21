import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1); // To handle subarrays that start at index 0

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            if (prefixSumCounts.containsKey(prefixSum - k)) {
                count += prefixSumCounts.get(prefixSum - k);
            }
            prefixSumCounts.put(prefixSum, prefixSumCounts.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}