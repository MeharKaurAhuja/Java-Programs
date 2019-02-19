import java.util.*;
class company3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0,c1=0;
        int d=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int s1=sc.nextInt();
                if(s1==0)
                    c++;
                else if(s1==1)
                    c1++;
            }
            if(c==m)
            {
                d++;
            }
            System.out.println(d);
        }
    }
}