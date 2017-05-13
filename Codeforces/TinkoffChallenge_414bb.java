import java.util.Scanner;

public class b
{
    public static void main(String[] args) {
        double n;double h;
        Scanner sc=new Scanner(System.in);
        n=(double)sc.nextInt();
        h=(double)sc.nextInt();
        double a;
        for (double i =1.0 ; i <n; i++) {
            a=Math.sqrt(i*h*h/n);
            System.out.print(a+" ");

        }
    }
}