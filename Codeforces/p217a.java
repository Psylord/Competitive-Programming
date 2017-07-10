

/**
 * Created by jai on 11/7/17.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jai on 11/7/17.
 */

public class p217a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int code[]=new int[2001];
        int edge[][]=new int[n][2];
        int no=1;
        for (int i = 0; i <n; i++) {
            int x=sc.nextInt()*2;
            int y=sc.nextInt()*2-1;
            if(code[x]==0)
            {
                code[x]=no;
                no++;
            }
            if(code[y]==0)
            {
                code[y]=no;
                no++;
            }
            edge[i][0]=code[x]-1;
            edge[i][1]=code[y]-1;
        }
        Graph g=new Graph(no-1);
        for (int i = 0; i <n; i++) {
            g.addEdge(edge[i][0],edge[i][1]);
        }
        System.out.println(g.noofcomponents()-1);
    }

}
class Graph {
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
    int noofcomponents()
    {
        int vis[]=new int[no];
        int ct=0;
        for(int i=0;i<no;i++)
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
        Iterator<Integer> itr=l[i].iterator();
        int t;
        for (int j = 0; j <l[i].size(); j++) {
            t=itr.next();
            if(vis[t]==0)
                dfs(vis,t);
        }
    }
}
