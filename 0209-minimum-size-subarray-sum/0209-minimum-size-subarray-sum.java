class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0;
        int r = 0;
        int sum = 0;
        int minLen = nums.length+1;
        while (r<=nums.length-1) {
            sum += nums[r];
                while (sum>=target) {
                    minLen = Math.min(minLen, r-l+1);
                    sum -= nums[l];
                    l++;
                }
            r++;
        }
        if (minLen == nums.length + 1) {
            return 0;
        }
        return minLen;
    }
}