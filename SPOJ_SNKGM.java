import java.util.Scanner;

/**
 * Created by yukesh on 5/10/2017.
 */
public class SPOJ_SNKGM {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int f=0;
        int p=sc.nextInt();
        for (int i = 0; i <p; i++)
            a[sc.nextInt()-1]=1;
        int q=sc.nextInt();
        for (int i = 0; i <q; i++)
            a[sc.nextInt()-1]=1;
        for (int i = 0; i <n; i++) {
            if(a[i]==0)
                f=1;

        }
        if(f==1)
            System.out.println(":-( Lost!!");
        else
            System.out.println("We win :-)");


    }
}

