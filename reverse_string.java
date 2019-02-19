import java.util.*;
class reverse_string
{
    public static void main(String args[])
    {
        int j,k;
        String rev="";
        String str="";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                i++;
            }    
            else
            {
                k=i;
                for(j=i;j<n && s.charAt(j)!=' ';j++)
                {
                   str=str+s.charAt(j);
                }
                for(k=j-1;k>=i;k--)
                {
                    rev=rev+s.charAt(k);
                }
                rev=rev+" ";
                i=j;
            }
            
        }
        System.out.println(rev);
    }
}