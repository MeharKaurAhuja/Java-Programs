import java.util.*;
class reverse_pallindrome
{
    public static void main(String args[])
    {
        int rem,sum=0,i=0,rem1,sum1=0,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int n1=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(n1==sum)
            System.out.println("No. of turns "+i);
        else
        {
            sum1=sum;
            n2=n1;
            while(n2!=sum1)
                
            {n1=n2+sum1;
             n2=n1;
             i++;
             sum1=0;
            while(n1!=0)
            {
               rem1=n1%10;
               sum1=sum1*10+rem1;
               n1=n1/10;
            }
             
            }
            System.out.println("No. of turns "+i);
        }
    }
}