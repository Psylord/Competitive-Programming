import java.util.Scanner;

/**
 * Created by jai on 11/6/17.
 */
public class p546a {
    public static void main(String[] args) {
        int n,k,w;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        int ans=Math.max(0,w*(w+1)*k/2-n);
        System.out.println(ans);
    }
}
