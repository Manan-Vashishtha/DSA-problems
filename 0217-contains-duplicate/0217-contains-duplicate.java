class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean check = false;
        HashSet <Integer> set =  new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                check = true;
            }
            set.add(nums[i]);
        }
        return check;
    }
}