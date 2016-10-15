//FIND nTH NUMBER IN A FIBONACCI SERIES
public class Fib 
{
    int nthFib(int n)
    {
        int i;
        int[] a = new int[10];
        a[0]=0;
        a[1]=1;
        for(i = 2;i<n;i++)
        {
            a[i] = a[i-1]+a[i-2];
        }
        return a[n-1];
    }
    public static void main(String args[])
    {
        int n= 8;
        Fib f = new Fib();
        int out = f.nthFib(n);
        System.out.println("output"+out);
    }
}
