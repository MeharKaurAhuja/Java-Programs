import java.util.*;
class palstring
{
    public static void main(String args[])
    {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("YES,the string is palindrome");
        }
        else
        {
            System.out.println("NO,the string is not palindrome");
        }
    }
}