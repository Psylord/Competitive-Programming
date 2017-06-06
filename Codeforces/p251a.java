import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 6/6/2017.
 */
public class p251a
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d;
        n=sc.nextInt();
        d=sc.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i <n; i++) {
            ar[i]=sc.nextInt();
        }
        long ct=0;
        int t;
        int in;
        for (int i = 0; i <n; i++) {
            in=Arrays.binarySearch(ar,i+1,n,ar[i]+d);
            if(in<0)
                in=-in-2;
            ct+=(long)(in-i)*(in-i-1)/2;

        }
        System.out.println(ct);


    }
}
