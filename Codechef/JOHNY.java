import java.util.Scanner;

/**
 * Created by jai on 24/6/17.
 */
public class Main {
    public static void main(String[] args) {
        int T,N;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            N=sc.nextInt();
            int ar[]=new int[N];
            for (int j = 0; j <N; j++) {
                ar[j]=sc.nextInt();
            }
            int k=ar[sc.nextInt()-1];
            int p=0;
            for (int j = 0; j <N; j++) {
                if(ar[j]<k)
                    p++;
            }
            System.out.println(p+1);
        }
    }
}
