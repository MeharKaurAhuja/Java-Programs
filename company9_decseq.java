import java.util.*;
class company9_decseq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int c=0,k=0,d=0;
        int a1[]=new int[100];
        if(n<=1)
        {
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("0");
            System.out.println("0");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                
                    if(a[i]>a[i+1])
                    {
                        c++;
                        
                    }
                    else if(a[i]<a[i+1] && c!=0)
                    {
                        a1[k]=c+1;
                        k++;
                        c=0;
                    }
                
            }
            d=a1[0];
            for(int i=0;i<k;i++)
            {
                if(d<a1[i])
                {
                    d=a1[i];
                }
            }
            System.out.println(k);
            System.out.println(d);
        }
    }
}