class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        int pIdx = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            int r = i;
            if(i == s.length()-1){
                r = r+1;
            }
            if( s.charAt(i) == ' ' || i == s.length()-1){
                if (pIdx >= pattern.length()) {
                     return false; 
                     }
                if(map.containsKey(pattern.charAt(pIdx))){
                    if(!map.get(pattern.charAt(pIdx)).equals(s.substring(l,r))){
                        return false;
                    }
                }else{
                        if (set.contains(s.substring(l,r))) {
                            return false;
                        }
                        map.put(pattern.charAt(pIdx), s.substring(l, r));
                        set.add(s.substring(l,r));
                    }
                    l=i+1;
                    pIdx++;
                }
            }
            return pIdx == pattern.length();
    }
}