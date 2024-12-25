package CollectionINJava;
import java.util.*;
@SuppressWarnings("all")
public class HashMapInJava {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("gfg", 10); //add value in hashmap
        m.put("course", 15);
        m.put("ide", 20);
        System.out.println(m);
        //Traverse the hashmap
        for(Map.Entry<String, Integer> e: m.entrySet()){ 
            System.out.println(e.getKey() + " = " + e.getValue());
        }
//check if key is present in hashmap or not
        if(m.containsKey("ide")){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        //check if value is present in hashmap or not
        if(m.containsValue(10)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        m.remove("ide"); //remove the key
        System.out.println(m.get("ide"));//return it is value
        System.out.println(m.size());
        System.out.println(m);
    }
}
