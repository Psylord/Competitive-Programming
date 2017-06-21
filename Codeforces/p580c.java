import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jai on 21/6/17.
 */
public class p580c {

    public static int dfs(int ca[],LinkedList l[],int m,int ct,int k,int vi[])
    {
        if(ct==m&&ca[k-1]==1)
            return 0;
        int sum=0;
        if(ca[k-1]==1)
            ct++;
        else
            ct=0;
        boolean a=false;
        vi[k]=1;
        Iterator ur=l[k].iterator();
        int t;
        while (ur.hasNext()) {
            t=(Integer)ur.next();
            if(vi[t]!=1)
            {
                sum += dfs(ca, l, m, ct,  t,vi);
                a=true;
            }
        }
        if(a)
        return (sum);
        else
            return 1;
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        LinkedList<Integer> l[]=new LinkedList[n+1];
        int ca[]=new int[n];
        int vi[]=new int[n+1];
        vi[1]=1;
        for (int i = 0; i <n; i++) {
            ca[i]=sc.nextInt();
        }
        int t1,t2;

        for (int i = 0; i <n-1; i++) {
             t1=sc.nextInt();
             t2=sc.nextInt();
             if(l[t1]==null)
                 l[t1]=new LinkedList();
            if(l[t2]==null)
                l[t2]=new LinkedList();
             l[t1].add(t2);
             l[t2].add(t1);
        }
        int ans=dfs(ca,l,m,0,1,vi);
        System.out.println(ans);

    }
}
