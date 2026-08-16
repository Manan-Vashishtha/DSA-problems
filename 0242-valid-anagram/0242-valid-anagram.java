class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> l= new HashMap<>();
        HashMap<Character, Integer> l1= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            l.put(s.charAt(i), l.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            l1.put(t.charAt(i), l1.getOrDefault(t.charAt(i), 0)+1);
        }

        if (l.equals(l1)) {
            return true;
        }
         return false;   
    
        
    }
}