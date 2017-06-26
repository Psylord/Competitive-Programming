import java.util.Scanner;

/**
 * Created by jai on 26/6/17.
 */
public class p200b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for (int i = 0; i <n; i++) {
            sum+=sc.nextDouble();
        }
        System.out.println(sum/n);
    }
}
