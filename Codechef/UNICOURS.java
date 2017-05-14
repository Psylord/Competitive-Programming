import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.Math.max;

/**
 * Created by yukesh on 5/6/2017.
 */
public class Codechef_UNICOURS {
    public static void main(String args[])
    {
Scanner sc =new Scanner(System.in);
int m=0;
int T=sc.nextInt();
while(T!=0)
{
    int k=sc.nextInt();
    m=0;
    for(int i=0;i<k;i++)
    {
        m=max(m,sc.nextInt());

    }
    m=k-m;
    System.out.println(m);
    T--;

}
    }

}
