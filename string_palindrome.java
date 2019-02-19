import java.util.*;
class string_palindrome
{
    public static void main(String args[])
    {
        int rem,sum=0,num=0,num1;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            if(a[i]<1000000)
            {
                sum=0;
                while(a[i]!=sum)
                {
                    a[i]=a[i]+1;
                    num1=a[i];
                    sum=0;
                    while(num1!=0)
                    {
                        rem=num1%10;
                        sum=sum*10+rem;
                        num1=num1/10;
                    }
                    
                }
                System.out.println(sum);            
            }
        }
        
    }
}