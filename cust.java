// You are using Java
import java.util.*;
import java.lang.Math;
public class cust
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=0;
        double c=5;
        while(n!=0)
        {
            double p=Math.floor(c/2);
            s=s+p;
            c=p*3;
            n--;
        }
        System.out.print((int)s);
    }
}
