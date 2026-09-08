class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[] arr = s.toCharArray();
        int r = arr.length - 1;
        int l = 0;
        while(r>l){
        while (r>l && !set.contains(arr[r])) {
            r--;
        }
        while ( l<r && !set.contains(arr[l])) {
            l++;
        }
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        r--;
        l++;
        }
        return new String(arr);
    }
}