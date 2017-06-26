import java.util.Scanner;

/**
 * Created by jai on 24/6/17.
 */
public class CIELAB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println((A-B)%10==9? A-B-1:A-B+1);
    }
}
