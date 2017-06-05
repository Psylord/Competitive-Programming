import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jai on 5/6/17.
 */
public class NEO01
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger S;
        BigInteger Sn;
        int T,N,n;
        BigInteger t;
        T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            N=sc.nextInt();
            S=BigInteger.ZERO;
            Sn=BigInteger.ZERO;
            n=0;
            int ar[]=new int[N];
            for (int j = 0; j <N; j++) {
                ar[j]=sc.nextInt();
            }
            Arrays.sort(ar);
            for (int j = 0; j <N; j++) {
                 t=BigInteger.valueOf(ar[N-1-j]);

                 if(t.compareTo(BigInteger.ZERO)>=0)
                  {
                     S=S.add(t);
                     n++;
                 }
                 else
                 {
                     if(t.multiply(BigInteger.valueOf(-n-1)).compareTo(S)<=0)
                     {
                         S=S.add(t);
                         n++;
                     }
                     else
                     {
                        Sn=Sn.add(t);
                     }
                 }
            }
            S=(S.multiply(BigInteger.valueOf(n))).add(Sn);
            System.out.println(S);
        }
    }
}
