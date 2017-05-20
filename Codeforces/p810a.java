import java.util.Scanner;

/**
 * Created by yukesh on 5/20/2017.
 */
public class p810a {
    public static void main(String[] args) {
        int n;
        int k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for (int i = 0; i <n; i++) {
            sum+=sc.nextInt();
        }
        int x=2*n*k-n-2*sum;
        System.out.println(x);
    }
}
