import java.util.Scanner;

/**
 * Created by yukesh on 5/15/2017.
 */
public class p519b {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long s1 = 0, s2 = 0;
        long k;
        for (int i = 0; i < n; i++) s1 += sc.nextLong();
        for (int i = 0; i < n - 1; i++) s2 += sc.nextLong();
        k = s1 - s2;
        System.out.println(k);
        for (int i = 0; i <n-2; i++) {
            s2 -= sc.nextLong();
        }
        System.out.println(s2);



    }
}
