package CollectionINJava;
import java.util.*;
@SuppressWarnings("all")
public class QueueInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Queue<Integer> Queue = new Queue<>(); //Syntax
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10); // we can also use offer to add element in queue
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.peek());//Print top element of queueack
        System.out.println(queue.poll()); //Remove laqueue element from top and give the value if we queueore in variable or we can use remove();
        System.err.println(queue.size()); //give size of the queueack
        System.out.println(queue.isEmpty()); //check if stack is empty.
    }
}
