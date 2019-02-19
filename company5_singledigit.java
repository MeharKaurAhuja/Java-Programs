import java.util.*;
class company5_codethroughstrings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        int c=0,sum=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            c++;
        }
        System.out.println(c);
        if(c<10)
        {
            System.out.println(c);
        }
        else
        {
            while(c>9)
            {
                int num=c;
                sum=0;
                while(num!=0)
                {
                    int rem=num%10;
                    sum=sum+rem;
                    num=num/10;
                } 
                c=sum;
            }
            System.out.println(c);
        }
    }
}