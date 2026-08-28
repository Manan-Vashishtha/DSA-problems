class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
            map.put('I' , 1);
            map.put('V' , 5);
            map.put('X' , 10);
            map.put('L' , 50);
            map.put('C' , 100);
            map.put('D' , 500);
            map.put('M' , 1000);
            
            int sum = 0;
            int j = 1;
            for(int i = 0; i < s.length() && j < s.length(); i++, j++){
                if(map.get(s.charAt(i)) >= map.get(s.charAt(j))){
                    sum += map.get(s.charAt(i));
                }else{

                    sum  -= map.get(s.charAt(i));
                }
            }
            sum +=map.get(s.charAt(s.length() - 1));
                
            return sum;
    }
}