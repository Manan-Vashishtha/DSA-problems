class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: agar array null hai ya empty hai to profit 0 hi hoga
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int n = prices.length;
        
        // Agar sirf ek hi din ka price hai, toh buy-sell possible nahi
        if (n == 1) {
            return 0;
        }
        
        // minPriceSoFar rakhega ab tak ka sabse chhota price jo humne dekha hai
        int minPriceSoFar = prices[0];
        
        // maxProfitSoFar rakhega ab tak ka best profit
        int maxProfitSoFar = 0;
        
        // Loop start karte hain second element se, kyunki pehla already minPrice mein hai
        for (int i = 1; i < n; i++) {
            
            int currentPrice = prices[i];
            
            // Step 1: Check karo ki current price purane minimum se kam hai kya
            if (currentPrice < minPriceSoFar) {
                // Naya minimum mil gaya, update kar do
                minPriceSoFar = currentPrice;
            } 
            else {
                // Step 2: Agar current price minimum se kam nahi hai,
                // toh dekho ki isko bechne se kitna profit milega
                int potentialProfit = currentPrice - minPriceSoFar;
                
                // Step 3: Agar yeh potential profit ab tak ke best profit se zyada hai
                if (potentialProfit > maxProfitSoFar) {
                    maxProfitSoFar = potentialProfit;
                }
            }
        }
        
        // Final answer return karo
        return maxProfitSoFar;
    }
}