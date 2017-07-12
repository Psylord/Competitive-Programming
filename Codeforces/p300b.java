import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jai on 13/7/17.
 */
public class p300b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ar[][]=new int[n/3][3];
        int ind[]=new int[n];
        Arrays.fill(ind,-1);
        int k=0;
        int stat[]=new int[n/3];
        int t1,t2;
        for (int i = 0; i <m; i++) {
            t1=sc.nextInt()-1;
            t2=sc.nextInt()-1;
            if(ind[t1]!=-1&&ind[t2]!=-1)
            {
                if(ind[t1]==ind[t2])
                    continue;
                System.out.println(-1);
                System.exit(0);
            }
            else if(ind[t1]!=-1)
            {
                if(stat[ind[t1]]==3)
                {
                    System.out.println(-1);
                    System.exit(0);
                }
                ar[ind[t1]][stat[ind[t1]]]=t2+1;
                ind[t2]=ind[t1];
                stat[ind[t1]]++;
            }
            else if(ind[t2]!=-1)
            {
                if(stat[ind[t2]]==3)
                {
                    System.out.println(-1);
                    System.exit(0);
                }
                ar[ind[t2]][stat[ind[t2]]]=t1+1;
                ind[t1]=ind[t2];
                stat[ind[t2]]++;
            }
            else
            {
                if(k==n/3)
                {
                    System.out.println(-1);
                    System.exit(0);
                }
                ar[k][0]=t1+1;
                ar[k][1]=t2+1;
                stat[k]=2;
                ind[t1]=k;
                ind[t2]=k;
                k++;

            }
        }
        int in=0;
        for (int i = 0; i <n/3; i++) {
            for (int j = 0; j <3; j++) {
                if(ar[i][j]==0)
                {
                    while(ind[in]!=-1)
                        in++;
                    ar[i][j]=in+1;
                    in++;
                }
            }
        }
        for (int i = 0; i <n/3; i++) {
            System.out.println(ar[i][0]+" "+ar[i][1]+" "+ar[i][2]);
        }

    }
}
