package CollectionINJava;
import java.util.*;
@SuppressWarnings("all")
public class HashsetInjava{
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("gfg");
        h.add("course");
        h.add("ide");
        System.out.println(h);
        System.out.println(h.contains("ide"));
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.println(i.next() + " ");

        }

        /*
         for(String s:h){
            System.out.print(s + " "); //Print the hashset element without using iterator
         }
         */
        System.out.println(h.remove("ide")); //remove the element.
        System.out.println(h.size());
        h.clear();//clear the hashset
        System.out.println(h.isEmpty()); //check if hashset is empty or not in true or false
        

    }
}