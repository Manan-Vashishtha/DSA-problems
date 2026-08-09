class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxP = 0;
        for(int i=0; i<nums.length; i++){
            buy = Math.min(buy, nums[i]);
            int currP = nums[i] - buy;
            maxP = Math.max(maxP, currP);
        }
        return maxP; 
    }
}