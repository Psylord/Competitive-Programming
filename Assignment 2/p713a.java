import java.awt.geom.Line2D;
import java.io.*;
import java.awt.*;
import java.util.*;
/**
 * Created by yukesh on 6/9/2017.
 */
public class p713a {
        public static long l=10000000000L;

        public static void main(String[] args) throws Exception {
            PrintWriter out = new PrintWriter(System.out);
            StringBuilder sb = new StringBuilder();
            Scanner sc = new Scanner(System.in);
            long n =sc.nextLong() , x =sc.nextLong()  , y=sc.nextLong();
            double minimunDist = Long.MAX_VALUE;
            double maximumDist = Long.MIN_VALUE;
            double arr[][] = new double[(int)n][2];
            int i =0;
            while(n-->0)
            {
                double temp1=sc.nextLong() , temp2=sc.nextLong();
                minimunDist=Math.min(minimunDist,Math.sqrt((x-temp1)*(x-temp1)+(y-temp2)*(y-temp2)));
                maximumDist=Math.max(maximumDist,Math.sqrt((x-temp1)*(x-temp1)+(y-temp2)*(y-temp2)));
                arr[i][0]=temp1; arr[i++][1]=temp2;
            }
            for (int j = 0; j < arr.length; j++)
            {
                int j2=j+1;
                if(j2==arr.length)j2=0;
                minimunDist=Math.min(minimunDist, Line2D.ptSegDist(arr[j][0],arr[j][1],arr[j2][0],arr[j2][1], x,y));
            }
            //System.out.println(minimunDist);
            //System.out.println(maximumDist);

            out.printf("%.18f",Math.PI*((maximumDist*maximumDist)-(minimunDist*minimunDist)));	out.flush();out.close();
        }

}
