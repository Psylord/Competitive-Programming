import java.util.Scanner;

/**
 * Created by yukesh on 5/24/2017.
 */
public class p363b {
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i <n; i++) {
            ar[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int s=0;
        int in=0;
        for (int i = 0; i <n; i++) {
            s=ar[i]+s;
            if(i>=(k-1))
            {
                s=(i>=k)?s-ar[i-k]:s;
                if(min>s) {
                    min=s;
                    in = i;
                }
            }
        }
        in=in+2-k;
        System.out.println(in);
    }
}
