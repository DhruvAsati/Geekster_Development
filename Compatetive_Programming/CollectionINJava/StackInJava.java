package CollectionINJava;
import java.util.*;
@SuppressWarnings("all")
public class StackInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Stack<Integer> stack = new Stack<>(); //Syntax
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());//Print top element of stack
        System.out.println(st.pop()); //Remove last element from top and give the value if we store in variable
        System.err.println(st.size()); //give size of the stack
        System.out.println(st.isEmpty()); //check if stack is empty.
    }
}
