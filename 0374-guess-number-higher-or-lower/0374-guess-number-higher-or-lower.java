

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (l<=r) {
            int mid = l +(r-l)/2;
            int res = guess(mid);
            if(res==1){
                l=mid+1;
            }else if( res==-1){
                r=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}