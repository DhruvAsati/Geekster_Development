package CollectionINJava;
import java.util.*;
@SuppressWarnings("all")
public class iteratorInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> C = new ArrayList<>();
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            C.add(n);
        }

        removefun(C);
    }
    public static void removefun(Collection<Integer> C){
        Iterator<Integer> it = C.iterator();
        while(it.hasNext()){
            int x = (Integer)it.next();
            if(x % 2 == 0){
                it.remove();
            }
        }

        for(int i : C){
            System.out.print(i+ " ");
        }
    }
}
