class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;
        int countDupli = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                countDupli++;
                if (countDupli < 3) {
                    i++;
                    nums[i] = nums[j];
                }
            } else {
                countDupli = 1;
                i++;
                nums[i] = nums[j];
            }
         j++;
        }
        return i+1;
    }
}