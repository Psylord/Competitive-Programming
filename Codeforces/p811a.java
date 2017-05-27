import java.util.Scanner;

/**
 * Created by yukesh on 5/27/2017.
 */
public class p811a {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        int na=(int)Math.floor(Math.sqrt((double)a));
        int ba=(int)Math.floor((Math.sqrt(1.0+4*(double)b)-1)/2);
        if(ba>=na)
            System.out.println("Vladik");
        else
            System.out.println("Valera");
    }
}
