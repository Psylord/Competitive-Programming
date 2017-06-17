import java.util.Scanner;

/**
 * Created by jai on 17/6/17.
 */
public class p816a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        StringBuffer mb=new StringBuffer(sc.next());
        StringBuffer te;
        int time=Integer.parseInt(mb.substring(0,2))*60+Integer.parseInt(mb.substring(3,5));
        int temp=0;
        for (int i = time;;i= (i==1440)? 0 :i+1 ) {
            if(i==0) {
                temp=1440-time;
                mb.replace(0, 5, "00:00");
            }
                else {
                mb.replace(2 - Integer.toString(i / 60).length(), 2, Integer.toString(i / 60));
                mb.replace((i%60==0)?3 :5-Integer.toString(i %60).length(), 5, Integer.toString(i % 60));
            }
            te=new StringBuffer(mb.toString());
            te=te.reverse();
            if((te.toString()).equals(mb.toString()))
            {
                System.out.println(((temp!=0)? temp+i:i-time));
                break;
            }

        }
    }
}
