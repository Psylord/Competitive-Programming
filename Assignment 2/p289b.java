import java.util.*;
/**
 * Created by yukesh on 6/9/2017.
 */
public class p289b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int d=s.nextInt();
        int flag=0;
        int a[]=new int[n*m];
        a[0]=s.nextInt();
        for(int i=1;i<n*m;i++){
            a[i]=s.nextInt();
            if(Math.abs(a[i]-a[i-1])%d!=0){
                System.out.println("-1");
                flag=1;
                break;
            }
        }
        if(flag==0){
            Arrays.sort(a);
            int sum=0;
            for(int i=0;i<m*n;i++){
                sum+=(Math.abs(a[i]-a[(m*n)/2])/d);
            }
            System.out.println(sum);
        }
    }
}
