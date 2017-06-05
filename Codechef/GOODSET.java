import java.util.Scanner;

/**
 * Created by jai on 4/6/17.
 */
public class GOODSET {
    public static void main(String args[])
    {
        int T;
        Scanner sc=new Scanner(System.in);
        int N;
        int t;
        T=sc.nextInt();
        for (int i = 0; i <T; i++) {
         N=sc.nextInt();
            for (int j = 0; j <N; j++) {
                t=2*j+1;
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}
