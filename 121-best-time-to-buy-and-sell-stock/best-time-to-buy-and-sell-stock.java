public class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables for tracking the minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Loop through the prices
        for (int price : prices) {
            // Update the minimum price encountered so far
            minPrice = Math.min(minPrice, price);
            
            // Calculate potential profit if sold at the current price
            int potentialProfit = price - minPrice;
            
            // Update the maximum profit
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        
        return maxProfit;
    }
}