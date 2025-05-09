import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create a map to store the frequency of elements in nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Fill the map with elements from nums1 and their counts
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // List to store the result (intersection)
        List<Integer> result = new ArrayList<>();
        
        // Iterate over nums2 and check if elements exist in the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);  // Add to result list
                map.put(num, map.get(num) - 1);  // Decrease the count in the map
            }
        }
        
        // Convert the result list to an array
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        
        return intersection;
    }
}