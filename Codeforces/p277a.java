import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jai on 11/7/17.
 */
public class p277a {
    static class Graph {
        int ar[][];
        int no;
        LinkedList l[];
        Graph(int n)
        {
            ar=new int[n][n];
            no=n;
            l=new LinkedList[n];
        }
        void addEdge(int i,int j)
        {
            ar[i][j]=1;
            ar[j][i]=1;
            if(l[j]==null)
                l[j]=new LinkedList();
            if(l[i]==null)
                l[i]=new LinkedList();
            l[i].add(j);
            l[j].add(i);
        }
        int noofcomponents(int lim)
        {
            int vis[]=new int[no];
            int ct=0;
            for(int i=0;i<lim;i++)
            {
                if(vis[i]==0)
                {
                    ct++;
                    dfs(vis,i);
                }
            }
            return ct;
        }
        void dfs(int vis[],int i)
        {
            vis[i]=1;
            if(l[i]==null)
                return;
            Iterator<Integer> itr=l[i].iterator();
            int t;
            for (int j = 0; j <l[i].size(); j++) {
                t=itr.next();
                if(vis[t]==0)
                    dfs(vis,t);
            }
        }
    }
    public static void main(String[] args) {
        int f=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Graph g=new Graph(n+m);
        for (int i = 0; i <n; i++) {
            int no=sc.nextInt();
            if(no!=0)
                f=1;
            for (int j = 0; j <no; j++) {
                g.addEdge(i,n+sc.nextInt()-1);
            }
        }
        System.out.println(g.noofcomponents(n)-((f==0)? 0:1));
    }
}
