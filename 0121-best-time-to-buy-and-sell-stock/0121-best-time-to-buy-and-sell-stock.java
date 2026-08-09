class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxP = 0;
        for(int i=0; i<prices.length; i++){
            buy = Math.min(buy, prices[i]);
            int currP = prices[i] - buy;
            maxP = Math.max(maxP, currP);
        }
        return maxP; 
    }
}