import java.util.*;
import java.lang.Math;
class sita
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the destination floor");
        int n=sc.nextInt();
        System.out.println("Enter the three floors");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int a=n-n1;
        int b=n-n2;
        int c=n-n3;
        int d=Math.abs(a);
        int e=Math.abs(b);
        int f=Math.abs(c);
        if((d<e) && (d<f))
        {
            System.out.println(n1);
        }
        else if((e<d) && (e<f))
        {
            System.out.println(n2);
        }
        else if((f<d) && (f<e))
        {
            System.out.println(n3);
        }
        else if(d==e)
        {
            if(a<b)
            {
                System.out.println(n1);
            }
            else
            {
                System.out.println(n2);
            }
        }
        else if(f==e)
        {
            if(b<c)
            {
                System.out.println(n2);
            }
            else
            {
                System.out.println(n3);
            }
        }
         else if(f==d)
        {
            if(a<c)
            {
                System.out.println(n1);
            }
            else
            {
                System.out.println(n3);
            }
        }
    }
}