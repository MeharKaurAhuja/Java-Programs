import java.util.*;
class superpalindrome
{
   public static void main(String args[])
   {
       int sum=0,rem,sum1,s,rem1,sum2=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any no.");
       int num=sc.nextInt();
       int n=num;
       while(num!=0)
       {
         rem=num%10;
         num=num/10;
         sum=(sum*10)+rem;
       }
       System.out.println(sum);
       sum1=n*n;
       s=sum1;
       while(sum1!=0)
       {
           rem1=sum1%10;
           sum2=(sum2*10)+rem1;
           sum1=sum1/10;
       }
       System.out.println(sum2);
       if(sum2==s && sum==n)
       {
           System.out.println("No. is Super Palindrome");
       }
       else
           System.out.println("No. is not a Super Palindrome");
   }
}