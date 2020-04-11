class MinStack {

    /** initialize your data structure here. */
    
    int[] mStack;
    int size;
    int capacity;
    
    public MinStack() {
        this.mStack = new int[10];
        this.size = 0;
        this.capacity = 10;
    }
    
    public void push(int x) {
        if (this.size == this.capacity) {
            doubleCapacity();
        }
        this.mStack[this.size] = x;
        size++;
    }
    
    public void pop() {
        if (this.size != 0) {
            this.mStack[this.size - 1] = 0;
            size--;
        }
    }
    
    public int top() {
        if (this.size != 0) {
            return this.mStack[this.size - 1];
        }
        return 0;
    }
    
    public int getMin() {
        int min = this.mStack[0];
        
        for (int i = 0; i < this.size; i++) {
            min = Math.min(min, this.mStack[i]);
        }
        return min;
    }
    
    private void doubleCapacity() {
        this.capacity *= 2;
        int[] temp = new int[this.capacity];
        
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.mStack[i];
        }
        
        mStack = temp;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
