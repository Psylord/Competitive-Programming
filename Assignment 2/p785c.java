import java.util.*;
/**
 * Created by yukesh on 6/9/2017.
 */
public class p785c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        if (m >= n){
            System.out.println(n);
        }else{
            n = n * 2 - m * 2;
            long x = (long) Math.sqrt(n) - 2;
            while (x * (x + 1) < n){
                x++;
            }
            System.out.println(x + m);
        }
    }

}
