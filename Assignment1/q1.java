import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 5/20/2017.
 */
public class p742b {

    public static final int LIMIT = 100005;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split1 = br.readLine().split(" ");
        int n = Integer.parseInt(split1[0]);
        int x = Integer.parseInt(split1[1]);

        int numbers[] = new int[n + 1];
        boolean mark[] = new boolean[LIMIT];
        int count[] = new int[LIMIT];
        String[] split2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(split2[i]);
            numbers[i] = number;
            count[number]++;
        }

        long sum = 0;
        if (n != 1) {
            if (x == 0) {
                for (int i = 0; i < n; i++) {
                    int left = numbers[i];
                    if (count[left] > 1) {
                        count[left]--;
                        sum += ((long) count[left]);
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    int left = numbers[i];
                    if (mark[left] == false) {
                        int xor = left ^ x;
                        if (xor < LIMIT) {
                            if (left == xor)
                                sum += (long) count[left] - 1;
                            else
                                sum += ((long) count[left] * (long) count[xor]);
                            mark[left] = true;
                            mark[xor] = true;
                        }
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
