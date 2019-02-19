import java.util.*;
class freq_char
{
    public static void main(String args[])
    {
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int n=s.length();
        s=s.toLowerCase();
        for(int i='a';i<='z';i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if(s.charAt(j)==i)
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println((char)i+"="+count);
            }
        }
          
    }
}