import java.util.*;

/**
 * Created by jai on 26/6/17.
 */
public class p727a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Deque<Integer> l=new LinkedList();
        while (a<b)
        {
            l.push(b);
            if(b%10==1)
            b=b/10;
            else if(b%2==0)
            b=b/2;
            else
            break;
            if(a==b)
            {
                l.push(b);
                Iterator<Integer> ir=  l.iterator();
                System.out.println("YES");
                System.out.println(l.size());
                while(ir.hasNext())
                    System.out.print(ir.next()+" ");
                System.exit(0);
            }


        }
     System.out.println("NO");
    }
}
