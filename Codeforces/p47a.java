import java.util.Scanner;

/**
 * Created by jai on 26/6/17.
 */
public class p47a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=2*sc.nextInt();
        if(Math.floor(Math.sqrt(n))*Math.ceil(Math.sqrt(n))==n&&Math.floor(Math.sqrt(n))!=Math.ceil(Math.sqrt(n)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
