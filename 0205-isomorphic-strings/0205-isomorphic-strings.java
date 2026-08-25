class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), t.charAt(i));
            mapT.put(t.charAt(i), s.charAt(i));
        }
        for (int j = 0; j < t.length(); j++) {
            if(t.charAt(j) != mapS.get(s.charAt(j)) || s.charAt(j) != mapT.get(t.charAt(j))){
                return false;
            }
        }
        return true;
    }
}