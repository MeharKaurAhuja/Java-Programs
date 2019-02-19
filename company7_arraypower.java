import java.util.*;
//'[}
ximport java.lang.Math;
class company7_arraypower
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int s=0,rem1;
        double res=0;
            while(n1!=0)
            {
                rem1=n1%10;
                res+=Math.pow(rem1,s);
                s=rem1;
                n1=n1/10;
            }
        System.out.println((int)res);
    }
}
