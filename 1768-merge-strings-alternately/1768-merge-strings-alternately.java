class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                res.append(word1.charAt(i));
                res.append(word2.charAt(i));
            }
            for (int i = word2.length(); i < word1.length(); i++) {
                res.append(word1.charAt(i));
            }
        } else if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                res.append(word1.charAt(i));
                res.append(word2.charAt(i));
            }
            for (int i = word1.length(); i < word2.length(); i++) {
                res.append(word2.charAt(i));
            }
        } else {
            for (int i = 0; i < word2.length(); i++) {
                res.append(word1.charAt(i));
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}