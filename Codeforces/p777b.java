import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 5/24/2017.
 */
public class p777b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[]=new char[n];
        char b[]=new char[n];

        a=sc.next().toCharArray();
        b=sc.next().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int ma=0;int mi=0;
        int j=n-1;
        int k=n-1;
        for (int i = n-1; i >=0; i--) {
            if(b[j]>=a[i])
                j--;
            else
            {
                mi++;
            }
            if(b[k]>a[i])
            {
                ma++;
                k--;
            }

        }
        System.out.println(mi);
        System.out.println(ma);
    }
}
