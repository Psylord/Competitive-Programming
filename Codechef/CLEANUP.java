import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jai on 24/6/17.
 */
public class CLEANUP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            int n, m;
            n=sc.nextInt();
            m=sc.nextInt();
            int ar[]=new int[m];
            int ans[]=new int[(int)Math.floor(((double)n-m)/2)];
            for (int j = 0; j <m; j++) {
                ar[j]=sc.nextInt();
            }
            Arrays.sort(ar);
            int t=-1;
            int p=0;
            int p1=0;
            for (int j = 1; j <=n; j++) {
                if (p!=m&&ar[p] == j)
                    p++;
                else {
                    if (t == -1)
                        System.out.print(j + " ");
                    else {
                        ans[p1] = j;
                        p1++;
                    }
                    t=t*-1;
                }
            }
                System.out.println();
            for (int j = 0; j <ans.length ; j++) {
                System.out.print(ans[j]+" ");
            }
                System.out.println();
            }
        }
    }

