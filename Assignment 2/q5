import java.util.*;
/**
 * Created by yukesh on 6/10/2017.
 */
public class ANARCO5B {
    private static int compute(int[] a, int[] b){
        int i = 0, j = 0, ans = 0, as = 0, bs = 0, al = a.length, bl = b.length;
        while (i < al && j < bl) {
            if (a[i] == b[j]) {
                ans+= a[i] + (as > bs ? as : bs);
                bs = 0;
                as = 0;
                ++i;
                ++j;
            } else if (a[i] > b[j]) {
                bs += b[j];
                j++;
            } else {
                as += a[i];
                i++;
            }
        }
        while (i < al) {
            as += a[i];
            i++;
        }
        while (j < bl) {
            bs += b[j];
            j++;
        }
        ans += (as > bs ? as : bs);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int al = in.nextInt();
            if (al == 0) {
                break;
            }
            int[] a = new int[al];
            int i = 0;
            while (i < al) {
                a[i] = in.nextInt();
                i++;
            }
            int bl = in.nextInt();
            int[] b = new int[bl];
            i = 0;
            while (i < bl) {
                b[i] = in.nextInt();
                i++;
            }
            System.out.println(compute(a, b));
        }
        in.close();

    }

}
