class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int k = i;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    break;
                }
                k++;
                if(j==needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}