import java.util.*;
class company11_findstringcode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        int n=s.length();
        char a[]=new char[n];
        int c=0,m=0,r,t,sum=0,p;
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ' && (i!=(n-1)))
            {
                c++;
            }
            else 
            {
                
                if(i!=(n-1))
                    c=c-1;
                //System.out.println(c);
                sum=0;
                for(int j=m;j<=c;j++)
                {
                    if(j!=c)
                    {
                        r=(int)s.charAt(j);
                        t=(int)s.charAt(c);
                        sum=sum+r-t;
                        c--;
                        
                    }
                    else
                    {
                        r=(int)s.charAt(j);
                        sum=sum+r-64;
                    }
                    
                }
                System.out.print(sum);
                c=i+1;
                m=i+1;
            }
        }
    }
}