import java.util.Scanner;

/**
 * Created by yukesh on 5/15/2017.
 */
public class p41a {
    public static void main(String[] args) {
        int N,K,C;
        int d=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        C=sc.nextInt();
        int n=C;
        int t;
        for (int i = 0; i <C; i++) {
            t=sc.nextInt();
            n+=(t-d-1)/K;
            d=t;
        }
        n+=(N-d)/K;
        System.out.println(n);
    }
}




