import java.util.Scanner;

/**
 * Created by yukesh on 5/26/2017.
 */
public class p101401a {
    public static void main(String[] args) {
        int A;int B;int C;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        int as=Math.min(A/2+B,C);
        System.out.println(as);
    }
}
