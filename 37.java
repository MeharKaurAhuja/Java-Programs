// You are using Java
import java.util.*;
import java.lang.Math;
public class 37
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int c=5;
        while(n!=0)
        {
            int p=floor(c/2);
            s=s+p;
            c=p*3;
            n--;
        }
        System.out.print(s);
    }
}
