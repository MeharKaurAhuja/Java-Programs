import java.util.*;
public class Lapindrome
{
    public static void Lap(String s)
    {
        int n=s.length();
        int p=n;
        int k=0,j=0;
        char a[]=s.toCharArray();
        char a1[]=new char[50];
        char a2[]=new char[50];
        for(int i=0;i<p;i++)
        {
            System.out.println(a[i]);
        }
        if(p%2==0)
        {
            n=n/2;
            for(int i=0;i<n;i++)
            {
                a1[k]=a[i];
                k++;
            }
            for(int i=n;i<p;i++)
            {
                a2[j]=a[i];
                j++;
            }
            Arrays.sort(a1);
            Arrays.sort(a2);
            int c=0,f=0;
            for(int i=0;i<n;i++)
            {
                if(a1[i]!=a2[i])
                {
                    c=1;
                    break;
                }
                else
                    f=1;
            }
            if(f==1&&c==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        else
        {
            n=n/2;
            for(int i=0;i<n;i++)
            {
                a1[k]=a[i];
                k++;
            }
            for(int i=n+1;i<p;i++)
            {
                a2[j]=a[i];
                j++;
            }
            Arrays.sort(a1);
            Arrays.sort(a2);
            for(int i=0;i<k;i++)
            {
                System.out.println(a1[i]);
            }
            int c=0,f=0;
            for(int i=0;i<n;i++)
            {
                if(a1[i]!=a2[i])
                {
                    c=1;
                    break;
                }
                else
                    f=1;
            }
            if(f==1&&c==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            Lap(s);
        }
    }
}
