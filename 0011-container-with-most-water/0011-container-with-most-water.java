class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxA = 0;

        while(left<right){
            int currA =  Math.min(height[left], height[right]) * (right-left);
            maxA = Math.max(maxA, currA);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxA;
    }
}