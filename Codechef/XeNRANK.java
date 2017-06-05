import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by yukesh on 6/3/2017.
 */
public class XeNRANK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BigInteger U,V,A;

        for (int i = 0; i <T; i++) {
            U=BigInteger.valueOf(sc.nextInt());
            V=BigInteger.valueOf(sc.nextInt());
            A=((U.add(V.add(BigInteger.ONE))).multiply(U.add(V)).divide(BigInteger.valueOf(2))).add(U.add(BigInteger.ONE));
            System.out.println(A);
        }

    }
}
