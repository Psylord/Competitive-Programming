import java.util.Scanner;

/**
 * Created by yukesh on 5/15/2017.
 */
public class p236a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a[]=new int[26];
        int c=0;

        for (int i = 0; i <s.length(); i++)
        {
            if(a[(int)s.charAt(i)-97]==0) {
                a[(int) s.charAt(i) - 97] = 1;
                c++;
            }


        }
        if(c%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

    }
}
