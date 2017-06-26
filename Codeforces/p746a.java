import java.util.Scanner;

/**
 * Created by jai on 26/6/17.
 */
public class p746a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.min(a,Math.min(b/2,c/4))*7);
    }
}
