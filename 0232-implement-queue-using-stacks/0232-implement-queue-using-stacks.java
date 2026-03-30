class MyQueue {
    Stack<Integer> st;
    Stack<Integer> helper;
    public MyQueue() {
        st=new Stack<>();
        helper=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(st.isEmpty())
        return -1;
        while(!st.isEmpty())
        helper.push(st.pop());
        int x=helper.pop();
        while(!helper.isEmpty())
        st.push(helper.pop());
        return x;
    }
    
    public int peek() {
         if(st.isEmpty())
        return -1;
        while(!st.isEmpty())
        helper.push(st.pop());
        int x=helper.peek();
        while(!helper.isEmpty())
        st.push(helper.pop());
        return x;
    }
    
    public boolean empty() {
        if(st.isEmpty())
        return true;
        return false; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */