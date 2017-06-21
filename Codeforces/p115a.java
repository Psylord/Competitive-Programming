import java.util.Scanner;

/**
 * Created by jai on 22/6/17.
 */
public class p115a {
    public static int root(int ar[],int i)
    {   int ct=0;
        while(ar[i]!=i)
        {
            ct++;
            i=ar[i];
        }
        return ct;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int t=0;
        int ar[]=new int[n];
        for (int i = 0; i <n; i++) {
            t=sc.nextInt();
            if(t==-1)
            {
                ar[i]=i;
            }
            else
                ar[i]=t-1;
        }
        int max=0;
        for (int i = 0; i <n; i++) {
            max=Math.max(max,root(ar,i));
        }
        System.out.println(max+1);
    }
}
