class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> obj = new Stack<>();
    public MinStack() {

    }
    
    public void push(int value) {
        stack.push(value);
        if(obj.isEmpty()){
            obj.push(value);
        }else if(value<=obj.peek()){
            obj.push(value);
        }
        
    }
    
    public void pop() {
        if(stack.peek().equals(obj.peek())){
            obj.pop();
            stack.pop();
        }else{
            stack.pop();
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return obj.peek();
    }
}