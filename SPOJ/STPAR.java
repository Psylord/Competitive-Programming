import java.util.Scanner;
import java.util.Stack;

/**
 * Created by yukesh on 5/24/2017.
 */
public class STPAR {
    public static void main(String[] args) {
        int n=1;
        int e;
        int t;
        int f=0;
        Stack st=new Stack();
        Scanner sc=new Scanner(System.in);
        while(n!=0)
        {
            n=sc.nextInt();
            f=0;
            if(n==0)
                break;
            e=1;
            for (int i = 0; i <n; i++) {
                t = sc.nextInt();
                if (t == e)
                    e++;
                else {
                    if((!st.empty())&&(Integer)st.peek()<(Integer)t)
                    {
                        f=1;

                    }
                    st.push(new Integer(t));
                }

                while((!st.empty())&&(((Integer)st.peek()).intValue()==e))
                {
                    e++;
                    st.pop();
                }
            }
            if(f==0)
                System.out.println("yes");
            else
                System.out.println("no");
            st.clear();
        }
    }
}
