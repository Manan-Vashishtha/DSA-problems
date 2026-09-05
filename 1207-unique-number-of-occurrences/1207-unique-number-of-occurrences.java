class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (Integer j : map.values()) {
            if(set.contains(j)){
                return false;
            }
            set.add(j);
        }
        return true;
    }
}