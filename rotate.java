import java.util.*;
import java.lang.Math;
class rotate
{
    public static void main(String args[])
    {
        System.out.println("Enter the size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the the number");
        int num=sc.nextInt();
        int rem,ans=0,p,i=0;
        int n1=num;
        while(n1!=ans)
        {
            rem=num%10;
            num=num/10;
            p=(int)(Math.pow(10,n-1));
            ans=(rem)*p+num;
            System.out.println(ans);
            num=ans;
            i++;
        }
        System.out.println("No. of turns is "+i);
        
    }
}