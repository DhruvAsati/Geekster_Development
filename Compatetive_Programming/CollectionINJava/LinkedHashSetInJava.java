package CollectionINJava;
import java.util.*;
@SuppressWarnings("all")
public class LinkedHashSetInJava {
    public static void main(String[] args) {
        //syntax
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s); //print in same format as it is inserted
        System.out.println(s.size());
        for(int i : s){
            System.out.print(i + " ");
        }

        s.remove(10); //remove the value. //output willbe 20 30 40 now.
    }
}
