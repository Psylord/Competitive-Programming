import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jai on 21/6/17.
 */
public class p404c {
    public static void main(String[] args) {
        int n;long k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        LinkedList<Integer> l[]=new LinkedList[n];
        int ar[]=new int[n];
        int max=0;
        for (int i = 0; i <n; i++) {
            ar[i]=sc.nextInt();
            if(l[ar[i]]==null)
                l[ar[i]]=new LinkedList();
            l[ar[i]].add(i+1);
            max=Math.max(max,ar[i]);
        }
        int edge[][]=new int[n-1][2];
        int no=0;
        Arrays.sort(ar);
        if((l[0]==null)||l[0].size()!=1)
        {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i <max; i++) {
            if((l[i+1]==null)||(l[0]==null)||l[i].size()*(k-((i==0)? 0:1))<l[i+1].size())
            {
                System.out.println(-1);
                System.exit(0);
            }
            int ct=0;
            int d=l[i].remove();
            Iterator<Integer>itr=l[i+1].iterator();
            while (itr.hasNext())
            {
                if(ct==k-((i==0)? 0:1))
                {
                    ct=0;
                    d=l[i].remove();
                }
                edge[no][0]=d;
                edge[no][1]=itr.next();
                no++;
                ct++;

            }
        }
        System.out.println(no);
        for (int i = 0; i <n-1; i++) {
            System.out.println(edge[i][0]+" "+edge[i][1]);
        }
    }
}
