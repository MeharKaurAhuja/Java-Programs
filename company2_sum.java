import java.util.*;
class company2_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int c=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            if(rem==1||rem==2||rem==3||rem==5||rem==7)
            {
                c=0;
            }
            else if(rem==0||rem==4||rem==6||rem==9)
            {
                c=1;
            }
            else if((rem==8))
            {
                c=2;
            }
            sum=sum+c;
            n=n/10;
        }
        
        System.out.println(sum);
    }
}
