import java.util.*;
@SuppressWarnings("all")
public class AltnativepostiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = alternativePositiveAndNegNum(arr, n);
    
        for(int i : res){
            System.out.print(i + " ");
            }
        }
    
    }
    public static int [] alternativePositiveAndNegNum(int [] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i]>= 0){
                list.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        //rearrangement of Array
        int pos = 0;
        int neg = 0;
        int idx = 0;
        while(pos < list.size() && neg < list2.size()){
            arr[idx++] = list.get(pos++);
            arr[idx++] = list2.get(neg++);

        }
        while(pos < list.size()){
            arr[idx++] = list.get(pos++);
        }
        while(neg < list2.size()){
            arr[idx++] = list2.get(neg++);
        }
        return arr;
    
    }
}
