import java.util.*;
class addone
{
   public static void main(String args[])
   {
       int sum=0,temp,rem,i,temp_sum=0,digit=1,sum1;
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int n=num;
       while(num!=0)
       {
         rem=num%10;
         num=num/10;
         sum=sum+digit;
         digit=digit*10;
       }
       sum1=sum+n;
       System.out.println(sum1);
   }
}