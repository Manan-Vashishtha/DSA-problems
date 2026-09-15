class Solution {
    public int[] sortArrayByParity(int[] nums1) {
        int[] arr = new int[nums1.length];
        int r = arr.length-1;
        int l = 0;
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i]%2 == 0){
                arr[l] = nums1[i];
                l++;
            }else{
            arr[r] = nums1[i];
            r--;
            }
        }
        return arr;
    }
}