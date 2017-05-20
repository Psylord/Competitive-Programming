import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 5/21/2017.
 */
public class p810c {
    public static void main(String[] args) {
        long s = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long ar[] = new long[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
        }
        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            s = s + ( (sqr(i) - 1) % 1000000007) * ar[i];
            s = s - ( (sqr( n - 1 - i) - 1) % 1000000007) * ar[i];

            if (s > 1000000007)
                s = s % (1000000007);
        }

        System.out.println(s);
    }
    static long sqr(int a ) {
        long r=1;
        for (int i = 0; i <a; i++) {
            r=(r*2)%1000000007;
        }
        return r;
    }
    }

