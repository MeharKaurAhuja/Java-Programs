import java.util.*;
class company10_workers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0,count=0,k=0;
        int a1[]=new int[100];
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<m;j++)
            {
                String str=sc.next().charAt(0);
                if(s=='Y')
                {
                    c++;
                }
            }
            if(c==m)
            {
                count++;
                a1[k]=count;
                k++;
            }
            else
            {
                count=0;
            }
        }
        int max=a1[0];
        for(int i=0;i<k;i++)
        {
            if(max<a1[i])
            {
                max=a1[i];
            }
        }
        System.out.println(max);
    }
}