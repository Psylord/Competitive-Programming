import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 5/29/2017.
 */
public class INOI1302 {
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int p[]=new int[n];
        int ar[][]=new int [n][300];
        int temp[];
        boolean rl[][]=new boolean [n][n];
        for (int i = 0; i <n; i++) {
            Arrays.fill(ar[i],Integer.MAX_VALUE);
            p[i]=sc.nextInt();
            for (int j = 0; j <p[i]; j++)
                ar[i][j]=sc.nextInt();
            Arrays.sort(ar[i]);

        }
        int a1,b1;
        int co;

        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                a1=0;b1=0;co=0;


                while(a1<p[i]&&b1<p[j])
                {
                    if(ar[i][a1]==ar[j][b1]) {
                        b1++;
                        a1++;
                        co++;
                        continue;
                    }
                    if(ar[i][a1]>ar[j][b1]) {
                        b1++;
                        continue;
                    }
                    if(ar[i][a1]<ar[j][b1])
                    {
                        a1++;
                        continue;
                    }
                }
                if(co>=k)
                {

                    rl[i][j]=true;
                    rl[j][i]=true;
                    for (int l = 0; l <n; l++) {
                        if(rl[i][l]&&!rl[j][l])
                        {
                            rl[j][l]=true;
                            rl[l][j]=true;
                        }
                        if(rl[j][l]&&!rl[i][l])
                        {
                            rl[l][i]=true;
                            rl[i][l]=true;
                        }
                    }
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(rl[0][i]) {

                c++;
            }
        }
        System.out.println(c);
    }
}
