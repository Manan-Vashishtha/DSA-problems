class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int c = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length % c == 0) {
                sum += nums[i] * nums[i];
            }
            c++;
        }
        return sum;
    }
}