import java.util.*;
class cardgame
{
    public static void main(String args[])
    {
        int rem,sum_even=0,sum_odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the card picked up by Johnny:");
        int n=sc.nextInt();
        while(n!=0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                sum_even=sum_even+rem;
            }
            else
            {
                sum_odd+=rem;
            }
            n=n/10;
        }
        if(sum_even==sum_odd)
        {
            System.out.println("Johnny will win the card game");
        }
        else
        {
            System.out.println("Johnny will not win the card game");
        }
        
    }
}