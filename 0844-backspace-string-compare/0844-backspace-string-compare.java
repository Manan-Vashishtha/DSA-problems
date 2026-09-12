class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        int cHash = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                cHash++;
            }
            if (cHash == 0) {
                str1.append(s.charAt(i));
            }
            if (cHash > 0 && s.charAt(i) != '#') {
                cHash--;
            }
        }
        cHash = 0;
        for (int i = t.length() - 1; i >= 0; i--) {
            if (t.charAt(i) == '#') {
                cHash++;
            }
            if (cHash == 0) {
                str2.append(t.charAt(i));
            }
            if (cHash > 0 && t.charAt(i) != '#') {
                cHash--;
            }
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
