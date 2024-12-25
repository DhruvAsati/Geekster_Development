package Arrays;
import java.util.*;
@SuppressWarnings("all")
public class InsertionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int cap = sc.nextInt();
       
        int [] arr = new int[cap];
        for(int i = 0; i < cap; i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int x = sc.nextInt();
        int pos = sc.nextInt();
       

       int res[] = insertElement(arr, cap, x, pos, n);
       for(int i : res){
        System.out.print(i + " ");
       }
    }
    public static int [] insertElement(int [] arr, int cap, int x, int pos, int n){
        if(n == cap){
           return new int[]{-1};
        }
        int[] newArray = new int[n + 1];

        for (int i = 0; i < n ; i++) {
            if (i < pos - 1)
                newArray[i] = arr[i];
            else if (i == pos - 1)
                newArray[i] = x;
            else
                newArray[i] = arr[i - 1];
        }

        return newArray;
    }
}
