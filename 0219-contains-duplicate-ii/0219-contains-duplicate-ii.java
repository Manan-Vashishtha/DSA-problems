class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        boolean result = false;
         for (int i = 0; i < nums.length; i++) {
             if(map.containsKey(nums[i])){
                 result = Math.abs(i-map.get(nums[i])) <= k;
                 if(result == true){
                    return result;
                 }
                }
                map.put(nums[i],i);
         }

        return result;
    }
}