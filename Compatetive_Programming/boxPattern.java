import java.util.*;
@SuppressWarnings("all")
public class boxPattern {
  /*
    1 1 1 1 1 1 1
    1 2 2 2 2 2 1
    1 2 3 3 3 2 1
    1 2 3 4 3 2 1
    1 2 3 3 3 2 1
    1 2 2 2 2 2 1
    1 1 1 1 1 1 1 
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int N = sc.nextInt();
            int[][] pattern = new int[2 * N - 1][2 * N - 1];

            for (int i = 0; i < 2 * N - 1; i++) {
                for (int j = 0; j < 2 * N - 1; j++) {
                    pattern[i][j] = 1 + Math.min(Math.min(i, j), Math.min(2 * N - 2 - i, 2 * N - 2 - j));
                }
            }

            for (int i = 0; i < 2 * N - 1; i++) {
                for (int j = 0; j < 2 * N - 1; j++) {
                    System.out.print(pattern[i][j] + " ");
                }
                System.out.println();
            }
                
        }
    }
}
