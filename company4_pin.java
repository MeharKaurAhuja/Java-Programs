import java.util.*;
class company4_pin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,rem,rem1,rem2,o=0,h=0,t=0,t1=0,t2=0,t3=0,th=0;
        System.out.println("Enter the numbers between 100 to 999");
        n1=sc.nextInt();
        if(n1<100&&n1>999)
        {
            System.out.println("Enter the numbers between 100 to 999");
            n1=sc.nextInt();
        }
        n2=sc.nextInt();
        if(n2<100&&n2>999)
        {
            System.out.println("Enter the numbers between 100 to 999");
            n2=sc.nextInt();
        }
        n3=sc.nextInt();
        if(n3<100&&n3>999)
        {
            System.out.println("Enter the numbers between 100 to 999");
            n3=sc.nextInt();
        }
        while(n1!=0)
        {
            if(n1>99)
            {
                rem=n1%10;
                rem1=n2%10;
                rem2=n3%10;
                if(rem<=rem1&&rem<=rem2)
                {
                    o=rem;
                }
                else if(rem1<=rem&&rem1<=rem2)
                {
                    o=rem1;
                }
                else if(rem2<=rem&&rem2<=rem1)
                {
                    o=rem2;
                }
                if(rem>=rem1&&rem>=rem2)
                {
                    t1=rem;
                }
                else if(rem1>=rem&&rem1>=rem2)
                {
                    t1=rem1;
                }
                else if(rem2>=rem&&rem2>=rem1)
                {
                    t1=rem2;
                }
                n1=n1/10;
                n2=n2/10;
                n3=n3/10;
            }
            if(n1>9)
            {
                rem=n1%10;
                rem1=n2%10;
                rem2=n3%10;
                if(rem<=rem1&&rem<=rem2)
                {
                    t=rem;
                }
                else if(rem1<=rem&&rem1<=rem2)
                {
                    t=rem1;
                }
                else if(rem2<=rem&&rem2<=rem1)
                {
                    t=rem2;
                }
                if(rem>=rem1&&rem>=rem2)
                {
                    t2=rem;
                }
                else if(rem1>=rem&&rem1>=rem2)
                {
                    t2=rem1;
                }
                else if(rem2>=rem&&rem2>=rem1)
                {
                    t2=rem2;
                }
                n1=n1/10;
                n2=n2/10;
                n3=n3/10;
            }
            if(n1>0)
            {
                rem=n1%10;
                rem1=n2%10;
                rem2=n3%10;
                if(rem<=rem1&&rem<=rem2)
                {
                    h=rem;
                }
                else if(rem1<=rem&&rem1<=rem2)
                {
                    h=rem1;
                }
                else if(rem2<=rem&&rem2<=rem1)
                {
                    h=rem2;
                }
                if(rem>=rem1&&rem>=rem2)
                {
                    t3=rem;
                }
                else if(rem1>=rem&&rem1>=rem2)
                {
                    t3=rem1;
                }
                else if(rem2>=rem&&rem2>=rem1)
                {
                    t3=rem2;
                }
                n1=n1/10;
                n2=n2/10;
                n3=n3/10;
            }
            if(t1>=t2&&t1>=t3)
                th=t1;
            else if(t2>=t1&&t2>=t3)
                th=t2;
            else if(t3>=t1&&t3>=t2)
                th=t3;
            System.out.print(th);
            System.out.print(h);
            System.out.print(t);
            System.out.print(o);
            
        }
            
    }
}