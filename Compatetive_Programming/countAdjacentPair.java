import java.util.*;
@SuppressWarnings("all")
public class countAdjacentPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = totalAdjacentPair(arr, n);
        System.out.println(count);
    }
    public static int totalAdjacentPair(int arr[] , int n){
        int totalCount = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] == arr[i + 1] - 1){
                totalCount++;
                
            }
        }
        return totalCount;
    }
}
