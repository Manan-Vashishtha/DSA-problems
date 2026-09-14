class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0)+1);
        }
        for (int i = 0; i < nums1.length; i++) {
            if(map.getOrDefault(nums1[i], -1) > 0){
                arr.add(nums1[i]);
                map.put(nums1[i], map.getOrDefault(nums1[i], 0)-1);
                if(map.get(nums1[i]) == 0){
                    map.remove(nums1[i]);
                }
            }
        }
        int res[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res; 
    }
}