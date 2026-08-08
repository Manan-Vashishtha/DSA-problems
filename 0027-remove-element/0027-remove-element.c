int removeElement(int* nums, int numsSize, int val) {
    int k = numsSize;

    for (int i = 0; i < k; ) {
        if (nums[i]==val) {
            nums[i] = nums[k-1];
            k--;
        } else{
            i++;
        }
        
    }

    return k;
}