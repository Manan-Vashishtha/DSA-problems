class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> l= new HashMap<>();
        int count =0;
        if(t.length() != s.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            l.put(s.charAt(i), l.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(l.containsKey(t.charAt(i)) && l.getOrDefault(t.charAt(i), -1)>0){
                l.put(t.charAt(i), l.getOrDefault(t.charAt(i), 0)-1);
                if(l.get(t.charAt(i))==0){
                    l.remove(t.charAt(i));
                }
                count++;
            }
        }
        
        if(count == t.length()){
            return true;
        }else{
            return false;
        }
    }
}