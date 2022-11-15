
import java.util.*;

public class LinkedListTest {
    public static void show(Queue<Integer> q) {
        while(!q.isEmpty())
            System.out.println(q.poll());
    }

    public static void show(Stack<Integer> p) {
        while(!p.isEmpty())
            System.out.println(p.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        queue.add(2);
        queue.add(3);
        queue.add(7);
        queue.add(2);
        queue.add(8);
        queue.add(99);
        show(queue);

        stack.add(2);
        stack.add(3);
        stack.add(7);
        stack.add(2);
        stack.add(8);
        stack.add(99);
        show(stack);
    }
}
