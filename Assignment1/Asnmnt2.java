import java.util.Scanner;

/**
 * Created by yukesh on 5/20/2017.
 */
public class Asnmnt2 
    {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.next());
            while (n-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                printPrimesBetween(a, b);
                System.out.println();
            }
            sc.close();
        }

        public static void printPrimesBetween(int n, int m) {
            for (int i = n; i <= m; i++) {
                if (isPrime(i))
                    System.out.println(i);
            }
        }

        private static boolean isPrime(int n) {
            if (n == 0 || n == 1)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
                else
                    continue;
            }
            return true;
        }
    }
