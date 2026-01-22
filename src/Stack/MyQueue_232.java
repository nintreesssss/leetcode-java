//LeetCode 232:用栈实现队列
//https://leetcode.cn/problems/implement-queue-using-stacks/

package Stack;

import java.util.Stack;

class MyQueue_232{
    private Stack<Integer> a;
    private Stack<Integer> b;
    
    public MyQueue_232(){
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x){
        a.push(x);
    }

    public boolean empty(){
        return a.isEmpty();
    }

    public int pop(){
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
        int x = b.peek();
        b.pop();
        while (!b.isEmpty()) {
            a.push(b.pop());
        }
        return x;
    }

    public int peek(){
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
        int x = b.peek();
        while (!b.isEmpty()) {
            a.push(b.pop());
        }
        return x;       
    }
}

/*思路：维护两个栈，a为主栈，当需要出队时把a内元素全部反向压入b栈，这样b内元素与a内元素的先后
入栈顺序相反，与队列的先进先出顺序相同*/