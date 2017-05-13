import java.util.Scanner;

/**
 * Created by yukesh on 5/13/2017.
 */
public class a {
    public static void main(String[] args) {
        int a,b,c,n;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        n=sc.nextInt();
        int co=0;
        int k;
        for (int i = 0; i <n; i++) {
            k=sc.nextInt();
            if (k>b&&k<c)
               co++;

        }
        System.out.println(co);
    }
}
