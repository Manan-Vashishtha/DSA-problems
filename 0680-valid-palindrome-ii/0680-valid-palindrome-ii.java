class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(r>l){
            if(s.charAt(r) != s.charAt(l)){
                if(isPalindrome(s, l+1, r)){
                    return true;
                }
                if(isPalindrome(s, l, r-1)){
                    return true;
                }
                return false;
            }

            r--;
            l++;
        }
        return true;
    }
    public static boolean isPalindrome(String s, int l, int r){
        while(r>l){
            if(s.charAt(r) != s.charAt(l)){
                return false;
            }
            r--;
            l++;
        }
        return true;
}
}

