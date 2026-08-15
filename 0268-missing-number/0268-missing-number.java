class Solution {
    public int missingNumber(int[] nums) {
        int newSum = 0;
        int oldSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            if(i < nums.length){
                oldSum += nums[i];
            }
            newSum += i;
        }
        
        return newSum-oldSum; 
    }
}