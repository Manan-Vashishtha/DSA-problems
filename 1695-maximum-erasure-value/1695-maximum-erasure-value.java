class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int l=0;
        int r=0;
        int sum=0;
        int maxSum=0;
        while(r<=nums.length-1){
            sum += nums[r];
            while(set.contains(nums[r])){
                sum-= nums[l];
                set.remove(nums[l]);
                l++;
            }
            maxSum = Math.max(maxSum, sum);
            set.add(nums[r]);
            r++;
        }
        return maxSum;
    }
}