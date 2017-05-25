import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by yukesh on 5/24/2017.
 */
public class p807c {
    public static void main(String[] args) {
        double p,q,x,y,k,a;
        BigInteger s;
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 0; i <t; i++) {
        x=(double)sc.nextInt();
        y=(double)sc.nextInt();
        p=(double)sc.nextInt();
        q=(double)sc.nextInt();
        if(q==p&&x==y) {
            System.out.println(0);
            continue;
        }
            if(p==0&&x==0)
            {
                System.out.println(0);
                continue;
            }
            if(q==p&&x!=y) {
                System.out.println(-1);
                continue;
            }
            if(p==0&&x!=0) {
                System.out.println(-1);
                continue;
            }
        k=Math.ceil((y-x)/(q-p));
        if(k<=Math.ceil(x/p))
        {
            a=Math.ceil(x/p)*p-x;
            s=BigInteger.valueOf((long)q).multiply(BigInteger.valueOf((long)Math.ceil(x/p))).subtract(BigInteger.valueOf((long)y));


        }
        else
        {
            a=k*p-x;
            s= BigInteger.valueOf((long) q).multiply(BigInteger.valueOf((long)k)).subtract(BigInteger.valueOf((long)y));

        }
        System.out.println(s);
        }


    }
}
