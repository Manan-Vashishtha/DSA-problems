class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && Math.abs(stack.peek() -s.charAt(i)) == 32) {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();

        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.reverse().toString();
    }
}