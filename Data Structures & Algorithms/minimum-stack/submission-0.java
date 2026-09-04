class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        mainStack.push(val);
    }
    
    public void pop() {
        if(minStack.peek().equals(mainStack.peek())){
            minStack.pop();
        }
        mainStack.pop();
    }
    
    public int top() {
       return mainStack.peek();
    }
    
    public int getMin() {
       return minStack.peek();
    }
} /**Time Complexity O(1) */