import java.util.ArrayList;
import java.util.Collections;

public class MinStack {
ArrayList<Integer>stack=new ArrayList<Integer>();
        int top;
    public MinStack() {
        this.stack=stack;
        this.top=-1;
    }
    
    public void push(int val) {
        this.stack.add(val);
        this.top++;
    }
    
    public void pop() {
        this.stack.remove(this.top--);
    }
    
    public int top() {
        return this.stack.get(this.top);
    }
    
    public int getMin() {
        return Collections.min(this.stack);
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
