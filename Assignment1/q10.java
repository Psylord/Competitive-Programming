import java.util.Scanner;

/**
 * Created by yukesh on 5/25/2017.
 */
public class p779b {
    public static void main(String[] args) {
        int n,k,nu=0,ct=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        while(n>0)
        {
            if(n%10==0)
                ct++;
            else
                nu++;
            if(ct==k)
            {
                System.out.println(nu);
                break;
            }
            n=n/10;
        }
        nu=(ct!=0)?nu+ct-1:nu+ct;

        if(ct!=k)
            System.out.println(nu);
    }
}
