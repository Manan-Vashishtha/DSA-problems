class Solution {
    public int maxArea(int[] height) {
        int j = height.length-1;
        int maxA = 0;

        for (int i = 0; i < j;) {
            int currA = Math.min(height[i], height[j]) * (j-i);
            maxA = Math.max(maxA, currA);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxA;
    }
}