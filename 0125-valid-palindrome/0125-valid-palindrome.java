class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                t.append(s.charAt(i));
            }
        }
        int l = 0;
        int r = t.length() - 1;
        while (r > l) {
            if (t.charAt(r) != t.charAt(l)) {
                return false;
            }
            r--;
            l++;

        }
        return true;
    }
}