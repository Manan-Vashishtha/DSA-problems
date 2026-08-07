class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }

        }
        for (int i = 0; i < j+1; i++) {
            System.out.println(nums[i]);
        }
        return j+1;
    }
}