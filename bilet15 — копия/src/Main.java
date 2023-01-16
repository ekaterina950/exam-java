import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int numNegatives = 0;
        while(!s.isEmpty()) {
            if(s.peek() < 0)
                numNegatives++;
            q.add(s.pop());
        }

        while(numNegatives > 0) {
            if(q.peek() < 0) {
                s.push(q.remove());
                numNegatives--;
            } else {
                q.add(q.remove());
            }
        }

        while(!q.isEmpty())
            s.push(q.remove());

        System.out.println(s);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(-5);
        stack.push(2);
        stack.push(-2);
        stack.push(7);
        stack.push(0);
        stack.push(-3);
        splitStack(stack);

    }
}