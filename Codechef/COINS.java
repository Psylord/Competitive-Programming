import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by jai on 19/6/17.
 */
public class COINS {
    static long ar[]=new long[100000000];
    public static void main(String args[]) throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=0;
        while(t<20) {
            long n = Long.parseLong(sc.readLine());
            if(n==-1)
            {
                System.exit(1);
            }
            System.out.println(max(n));
            t++;
        }

    }
    public static long max(long n)
    {
        if(n==0)
            return 0;
        else if(n<100000000&&ar[(int)n]!=0)
        {
            return ar[(int)n];
        }
        else
        {
            if(n<100000000) {
                ar[(int) n] = Math.max(n, max(n / 2) + max(n / 4) + max(n / 3));
                return (ar[(int) n]);
            }
            else
                return(Math.max(n,max(n/2)+max(n/4)+max(n/3)));

        }
    }

}