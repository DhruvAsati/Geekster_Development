import java.util.*;
@SuppressWarnings("all")
public class sumOfNnaturalNum{
    public static void main(String[] args) {
        //sum of N natural numbers 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int sum = 0;
        //simple using loop takes most time
        //Approch 1 Time compexity is c1n + c2
       /* for(int i = 1; i <= n; i++){
            sum+=i;
        }
        System.out.println(sum);*/ 

        //Approch 2 T.C( c1 ) constant.
       
       // System.out.print(n*(n+1)/2);

        //Approch 3 // T.C (n^2)

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                sum++;
            }
           
        }

        System.out.println(sum);

    }
}