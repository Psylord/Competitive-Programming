import java.util.Scanner;

/**
 * Created by jai on 26/6/17.
 */
public class p25b {
    public static void main(String[] args) {
        String s;int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=sc.next();
        for (int i = 1; i <n; i+=2) {
            if(i==n-2||i==n-1)
                System.out.print(s.substring(i-1,n));
            else
                System.out.print(s.substring(i-1,i+1)+"-");

        }
    }
}
