import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jai on 24/6/17.
 */
public class HORSES {
    public static void main(String[] args) {
        int T;int N;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            N=sc.nextInt();
            int min=Integer.MAX_VALUE;
            int ar[]=new int[N];
            for (int j = 0; j <N; j++)
                ar[j]=sc.nextInt();
            Arrays.sort(ar);
            for (int j = 1; j <N; j++) {
                min=Math.min(ar[j]-ar[j-1],min);
            }
            System.out.println(min);
        }
    }
}
