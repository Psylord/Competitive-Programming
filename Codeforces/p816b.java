import java.util.Scanner;

/**
 * Created by jai on 17/6/17.
 */
public class p816b {
    public static void main(String[] args) {
        int ar[]=new int[200002];
        Scanner sc=new Scanner(System.in);
        int n,k,q;
        n=sc.nextInt();
        k=sc.nextInt();
        q=sc.nextInt();
        int l,r;
        for (int i = 0; i <n; i++) {
            l=sc.nextInt();
            r=sc.nextInt();
            ar[l]+=1;
            ar[r+1]+=-1;
        }
        int sum=0;
        int f[]=new int [200002];
        for (int i = 0; i <200002; i++) {
            sum+=ar[i];
            f[i]=sum;
        }
        int f1[]=new int[200002];
        sum=0;
        for (int i = 0; i <200002; i++) {
            if(f[i]>=k)
                sum++;
            f1[i]=sum;
        }

        for (int i = 0; i <q; i++) {
            l=sc.nextInt();
            r=sc.nextInt();
            int an=f1[r]-f1[l-1];
            System.out.println(an);
        }
    }
}
