class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int l = 1;
        int r = num/2;
        while (l<=r) {
            int mid = l+(r-l)/2;
            long square = (long) mid * mid;
            if(square > num){
                r= mid-1;
            }else if( square < num){
                l = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}