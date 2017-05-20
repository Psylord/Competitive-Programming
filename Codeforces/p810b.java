package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yukesh on 5/20/2017.
 */
public class p810b {
    public static void main(String[] args) {
        int n,f;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        f=sc.nextInt();
        int k,l;
        int ma[]=new int[n];
        int sum=0;
        for (int i = 0; i <n; i++) {
            k=sc.nextInt();
            l=sc.nextInt();
            sum+=Math.min(k,l);
            ma[i]=Math.min(2*k,l)-Math.min(k,l);
        }
        Arrays.sort(ma);
        for (int i = 0; i <f; i++) {
            sum+=ma[n-i-1];
        }
        System.out.println(sum);
    }
}
