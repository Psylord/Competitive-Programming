import java.util.*;
import java.io.*;
import java.lang.*;
public class A {
    public static void main(String args[])
    {
       int T;
       Scanner sc=new Scanner(System.in);
       T=sc.nextInt();
       int N;
       while(T!=0)
       {
           N=sc.nextInt();
           ArrayList<Integer> a=new ArrayList<Integer>();
           for(int i=0;i<2*N;i++)
               a.add((Integer)sc.nextInt());
           Collections.sort(a);
           System.out.println(a.get((3*N-1)/2));
           for(int i=0;i<N;i++)
               System.out.print(a.get(i)+" "+a.get(2*N-1-i)+" ");
           T--;

       }
    }
}
