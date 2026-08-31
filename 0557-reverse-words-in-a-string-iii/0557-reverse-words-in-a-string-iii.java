class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
       int l = 0;
        for (int i = 0; i < arr.length; i++) {
            int r = i;
            if(i == arr.length-1){
                    r = i+1;
            }
            if(arr[i] == ' ' || i == arr.length-1){
                while(r > l){
                    char temp = arr[r-1];
                    arr[r-1] = arr[l];
                    arr[l] = temp;
                    r--;
                    l++;
                }
                l=i+1;
            }
        }
        return new String(arr);
    }
}