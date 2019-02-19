import java.util.*;
public class phone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        String s[]=new String[n];
        String s1[]=new String[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
            //sc.next();
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s1[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(s1[i].equals(s[j]))
                {
                    System.out.println(s1[i]+"="+a[j]);
                    //System.out.println(a[j]);
                    c=1;
                    break;
                }
            }
            if(c==0)
                System.out.println("Not Found");
        }
    }
}