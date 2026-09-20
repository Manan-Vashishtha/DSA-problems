class Solution {
    public int reverseDegree(String s) {
        int j = 1;
        int sum = 0;
        for (int i = 0; i <s.length(); i++) {
            int ch = 123- s.charAt(i);
            sum += ch*j;
            j++;
        }
        return sum;
    }
}