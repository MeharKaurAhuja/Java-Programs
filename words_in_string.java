import java.util.*;
class words_in_string
{
    public static void main(String args[])
    {
        int count=0,j;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==' ')
                i++;
            else
            {
                for(j=i;j<n && s.charAt(j)!=' ';j++)
                {
                    
                }
                count++;
                i=j;
            }
            
        }
        System.out.println(count);
    }
}