/**
 * Created by yukesh on 6/8/2017.
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class p483b
{

    private static long mod = 1000000007;
    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static class pair implements Comparable<pair>
    {
        Integer x, y;
        pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }

        public int compareTo(pair o) {
            int result = x.compareTo(o.x);
            if(result==0)
                result = y.compareTo(o.y);

            return result;
        }
    }

    static class SegmentTree
    {
        int st[];

        SegmentTree(int[] a,int n)
        {
            int x = (int)Math.ceil(Math.log(n)/Math.log(2));

            int Max_Size = 2*(int)(Math.pow(2, x))-1;

            st = new int[Max_Size];

            constructSegTreeUtil(a,0,n-1,0);
        }

        int getMid(int start,int end)
        {
            return (start+end)/2;
        }

        int constructSegTreeUtil(int[] a,int ss,int se,int si)
        {
            if(ss==se)
            {
                st[si] = a[ss];
                return a[ss];
            }

            int mid = getMid(ss, se);
            st[si] = constructSegTreeUtil(a, ss, mid, 2*si+1)+
                    constructSegTreeUtil(a, mid+1, se, 2*si+2);

            return st[si];
        }

        int getSum(int n, int qs, int qe)
        {
            if(qs<0 || qe>n-1 || qs>qe)
                return -1;

            return getSumUtil(0,n-1,qs,qe,0);
        }

        int getSumUtil(int ss, int se,int qs, int qe, int si)
        {
            if(qs<=ss && qe>=se)
                return st[si];

            if(qs>se || qe<ss)
                return 0;

            int mid = getMid(ss, se);

            return getSumUtil(ss, mid, qs, qe, 2*si+1)+
                    getSumUtil(mid+1, se, qs, qe, 2*si+2);
        }

        void updateValue(int[] a, int n, int i, int new_value)
        {
            if(i<0 || i>n-1)
                return;

            int diff = new_value - a[i];

            a[i] = new_value;

            updateValueUtil(0,n-1,i,diff,0);
        }

        void updateValueUtil(int ss, int se, int i, int diff, int si)
        {
            if(i<ss || i>se)
                return;

            st[si]+=diff;
            if(ss!=se)
            {
                int mid = getMid(ss, se);
                updateValueUtil(ss, mid+1, i, diff, 2*si+1);
                updateValueUtil(mid+1, se, i, diff, 2*si+2);
            }
        }
    }

    public static int[] suffle(int[] a,Random gen)
    {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            int ind = gen.nextInt(n-i)+i;
            int temp = a[ind];
            a[ind] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static ArrayList<Integer> primeFactorization(int n)
    {
        ArrayList<Integer> a =new ArrayList<Integer>();
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                a.add(i);
                n/=i;
            }
        }
        if(n!=1)
            a.add(n);
        return a;
    }

    public static void sieve(boolean[] isPrime,int n)
    {
        for(int i=1;i<n;i++)
            isPrime[i] = true;

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<n;i++)
        {
            if(isPrime[i] == true)
            {
                for(int j=(i*i);j<n;j++)
                    isPrime[j] = false;
            }
        }
    }

    public static int GCD(int a,int b)
    {
        if(b==0)
            return a;
        else
            return GCD(b,a%b);
    }

    public static long GCD(long a,long b)
    {
        if(b==0)
            return a;
        else
            return GCD(b,a%b);
    }

    public static long LCM(long a,long b)
    {
        return (a*b)/GCD(a,b);
    }

    public static int LCM(int a,int b)
    {
        return (a*b)/GCD(a,b);
    }

    public static int binaryExponentiation(int x,int n)
    {
        int result=1;
        while(n>0)
        {
            if(n % 2 ==1)
                result=result * x;
            x=x*x;
            n=n/2;
        }
        return result;
    }

    public static long binaryExponentiation(long x,long n)
    {
        long result=1;
        while(n>0)
        {
            if(n % 2 ==1)
                result=result * x;
            x=x*x;
            n=n/2;
        }
        return result;
    }

    public static int modularExponentiation(int x,int n,int M)
    {
        int result=1;
        while(n>0)
        {
            if(n % 2 ==1)
                result=(result * x)%M;
            x=(x*x)%M;
            n=n/2;
        }
        return result;
    }

    public static long modularExponentiation(long x,long n,long M)
    {
        long result=1;
        while(n>0)
        {
            if(n % 2 ==1)
                result=(result * x)%M;
            x=(x*x)%M;
            n=n/2;
        }
        return result;
    }

    public static int modInverse(int A,int M)
    {
        return modularExponentiation(A,M-2,M);
    }

    public static long modInverse(long A,long M)
    {
        return modularExponentiation(A,M-2,M);
    }

    public static long binarySearch(long cnt1,long cnt2,long x,long y)
    {
        long result = 0;
        long start = 1;
        long end = (long)1e10;

        while(start<=end)
        {
            long mid = (start+end)/2;

            long count1 = mid - (mid/x);
            long count2 = mid - (mid/y);
            long common = mid - (mid/x) - (mid/y) + (mid/(x*y));

            long total = count1 + count2 - common;

            if(count1<cnt1 || count2<cnt2 || total<(cnt1+cnt2))
                start = mid+1;

            else
            {
                result = mid;
                end = mid-1;
            }
        }

        return result;
    }
    public static void main(String[] args)
    {
        InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long cnt1 = in.nextLong();
        long cnt2 = in.nextLong();

        long x = in.nextLong();
        long y = in.nextLong();

        long ans = binarySearch(cnt1, cnt2, x, y);
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}