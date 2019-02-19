import java.util.*;
class cardgame2
{
    public static void main(String args[])
    {
        int rem,s=0,n2,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target score:");
        int n=sc.nextInt();
        System.out.println("Enter the scores taken by Patrick in each turn:");
        int n1=sc.nextInt();
        while(n>=n1)
        {
            if(n==n1)
            {
                break;
            }
            n1=n1+s;
            n2=sc.nextInt();
            n1=n1+n2;
            i++;
        }
        System.out.println("The no. of turns is "+i);
        
    }
}