class Solution {
    public int searchInsert(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        int count = 0;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                l = mid+1;
                count = mid;
                count++;
            }else{
                r = mid-1;
                count = mid-1;
                count++;
            }
        }
        return count;
    }
}