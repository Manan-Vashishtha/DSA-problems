class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int j = m-1;
        for (int i = n-1; i >= 0;) {
            if(j>=0 && nums2[i] < nums1[j]) {
               nums1[k] = nums1[j];
               j--;
            }else{
                nums1[k] = nums2[i];
                i--;
            }
            k--;
             
        }
    }
}