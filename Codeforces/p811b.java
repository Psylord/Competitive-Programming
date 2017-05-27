import java.util.Scanner;

/**
 * Created by yukesh on 5/27/2017.
 */
public class p811b {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int ar[]=new int[n];
        int l;int x;int r;
        int f;int k;
        for (int i = 0; i <n; i++) {
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i <m; i++) {
            l=sc.nextInt();
            r=sc.nextInt();
            x=sc.nextInt();
            k=ar[x-1];
            f=0;
            for (int j = l-1; j <=r-1 ; j++) {
                if(ar[j]<k)
                    f++;
            }
            if(f==(x-l))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
