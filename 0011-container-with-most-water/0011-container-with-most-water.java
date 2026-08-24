class Solution {
    public int maxArea(int[] height) {
        int j = height.length-1;
        int minH=0;
        int currA=0;
        int totalA = 0;
        for (int i = 0; i < j;) {
            minH = Math.min(height[i], height[j]);
            currA = minH * (j-i);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
            totalA = Math.max(totalA, currA);
        }
        return totalA;
    }
}