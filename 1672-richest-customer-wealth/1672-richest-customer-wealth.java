class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxS = 0;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            maxS = Math.max(maxS, sum);
        }
        return maxS;
    }
}