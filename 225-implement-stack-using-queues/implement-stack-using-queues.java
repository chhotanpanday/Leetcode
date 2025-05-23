class MyStack {
   public Queue<Integer> que;
    
    public MyStack() {
        que = new LinkedList<>();
    }
    
    public void push(int x) {
      que.add(x);
      int size = que.size(); // rotate the queue bringe new element
      for(int i = 0; i< size-1; i++){
        que.add(que.remove());
      }
    }
    
    public int pop() {
         return que.remove();
    }
    
    public int top() {
        return que.peek(); 
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */