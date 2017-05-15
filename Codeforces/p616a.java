import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yukesh on 5/16/2017.
 */
public class p616a {
    public static void main(String[] args)throws java.io.IOException {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s1=br.readLine();
     int f=0;
     String s2=br.readLine();
     while(s1.charAt(0)=='0'&&s1.length()>1)
         s1=s1.substring(1,s1.length());
     while(s2.charAt(0)=='0'&&s2.length()>1)
         s2=s2.substring(1,s2.length());
     if(s1.length()>s2.length())
         System.out.println(">");
     else if(s1.length()<s2.length())
         System.out.println("<");
     else
     {
         for (int i = 0; i <s1.length(); i++) {
             if(s1.charAt(i)>s2.charAt(i)) {
                 System.out.println(">");
                 f = 1;
                 break;
             }
             else if(s1.charAt(i)<s2.charAt(i))
             {
                 f=1;
                 System.out.println("<");
                 break;
             }

         }
         if(f==0)
             System.out.println("=");
     }

    }
}
