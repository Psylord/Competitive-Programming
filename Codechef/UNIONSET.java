import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 6/4/2017.
 */
public class UNIONSET {
    public static void main(String[] args) {
        int T,N,K,p;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        int ct;
        for (int i = 0; i <T; i++) {
            N=sc.nextInt();
            K=sc.nextInt();
            ct=0;
            BigInteger ar[]=new BigInteger[N];
            char temp[]=new char[K];
            for (int j = 0; j <N; j++) {
                Arrays.fill(temp,'1');
                p = sc.nextInt();
                for (int k = 0; k <p; k++) {
                    temp[sc.nextInt()-1]='0';
                }
                ar[j]=new BigInteger(new String(temp),2);
                for (int k = 0; k <j; k++) {
                    if(ar[j].and(ar[k]).equals(BigInteger.ZERO))
                       ct++;
                }
            }
            System.out.println(ct);
        }
    }
}
