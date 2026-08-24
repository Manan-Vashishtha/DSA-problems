class Solution {
    static{
        for(int i = 0; i<2; i++){
             maxArea(new int[]{0,0});
        }
    }
    public static int maxArea(int[] h) {
        int srt  = 0;
        int end = h.length-1;
        int maxWater  = 0;
        while(srt < end){
            int minH = Math.min(h[srt], h[end]);
            int area = minH * (end-srt);
            maxWater = Math.max(maxWater, area);
           while(srt < end && h[srt] <= minH){
            srt++;
           }
           while(srt < end && h[end] <= minH){
            end--;
           }
            
        }
        return maxWater;
        
    }
}