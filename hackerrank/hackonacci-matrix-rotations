import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        char a[][]=new char[n][n];
        String s="YYXYXXY";
        for(int i=0;i<n;i++)
            {
            for(int j=i;j<n;j++)
                {
                a[i][j]=s.charAt(((int)Math.pow((((i+1)%7)*((j+1)%7)),2))%7);
                a[j][i]=a[i][j];
            }
        }
        int r[]=new int[3];
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                if(a[i][j]!=a[n-1-j][i])
                    r[1]++;
                if(a[i][j]!=a[n-1-i][n-1-j])
                    
                    r[2]++;

                
            }
        }
        int k;
        for(int a0 = 0; a0 < q; a0++){
            int angle = in.nextInt();
            k=(angle/90)%4;
            if(k==0)
                System.out.println(0);
            if(k==1||k==3)
                System.out.println(r[1]);
            if(k==2)
                System.out.println(r[2]);
        }
    }
}
