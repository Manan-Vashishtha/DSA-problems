class Solution {
    public boolean checkInclusion(String t, String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(t.length()>s.length()){
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0)+1);
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }

        int k = t.length();
        for (int i = k; i < s.length(); i++) {
            map2.put(s.charAt(i-k), map2.getOrDefault(s.charAt(i-k), 0)-1);
            if(map2.get(s.charAt(i-k))==0){
                map2.remove(s.charAt(i-k));
            }
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0)+1);
            System.out.println(map2);
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}