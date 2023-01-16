import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();
        int size = q.size();

        for(int i = 0; i < size; i++) {
            if(i % 2 == 1)
                s.push(q.remove());
            else
                q.add(q.remove());
        }

        while(!s.isEmpty()) {
            q.add(q.remove());
            q.add(s.pop());
        }

        if(size % 2 == 1)
            q.add(q.remove());

        System.out.println(q);

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        reverseHalf(q);
    }
}