class MyQueue {
    Stack<Integer> st = new Stack<>();   
    Stack<Integer> sh = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        while(st.size()!=0){
           sh.push(st.pop()); 
        }
        st.push(x);
        while(sh.size()!=0){
           st.push(sh.pop()); 
        }
        
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0) return true ;
        return false ;
    }
}
