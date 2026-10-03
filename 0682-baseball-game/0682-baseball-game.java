class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].equals("C")){
                stack.pop();
            }else if(s[i].equals("D")){
                stack.add(2*stack.peek());
            }else if(s[i].equals("+")){
                int l = stack.peek();
                stack.pop();
                int secL = stack.peek();
                stack.add(l);
                stack.add(l+secL);
            }else{
                int p = Integer.valueOf(s[i]);
                stack.add(p);
            }
        }
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}