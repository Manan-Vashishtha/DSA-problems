class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') {
                if (count>0) {
                    stack.add(s.charAt(i));
                }
                count++;
            }else{
                count--;
                if (count>0) {
                    stack.add(s.charAt(i));
                }
            }

        }
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}