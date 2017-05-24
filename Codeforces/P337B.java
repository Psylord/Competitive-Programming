import java.util.Scanner;

/**
 * Created by yukesh on 5/24/2017.
 */
public class P337B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int p,q,r,s;
        if(a*d>=c*b)
        {
            p=a;
            q=b;
            r=c;
            s=d;
        }
        else
        {
            p=b;
            q=a;
            r=d;
            s=c;

        }
        int hc=1;
        for (int i = 1; i <=Math.min(q,s); i++) {
            if(q%i==0&&s%i==0)
                hc=i;
        }
        int lc=q*s/hc;
        int nu=Math.abs(p*lc/q-r*lc/s);
        int de=Math.max(p*lc/q,r*lc/s);

        for (int i = 1; i <=Math.min(nu,de); i++) {
            if(nu%i==0&&de%i==0)
                hc=i;
        }
        nu=nu/hc;
        de=de/hc;
        if(nu==0)
            de=1;
        System.out.println(nu+"/"+de);
    }
}
