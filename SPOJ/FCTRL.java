import java.util.Scanner;

/**
 * Created by yukesh on 5/14/2017.
 */
public class FCTRL {
    public static void main(String[] args) {
        int T;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        int ct;
        int d;
        int n;
        for (int i = 0; i <T; i++) {
            ct=0;
            d=5;
            n=sc.nextInt();
            while(n>=d)
            {
                ct+=n/d;
                d=d*5;
            }
            System.out.println(ct);

        }
    }
}
