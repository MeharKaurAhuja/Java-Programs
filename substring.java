import java.util.*;
class substring
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int length = sc.nextInt();
    int n=s.length();
    String smallest="";
    String largest="";
    for(int i = 0;i<=n-length;i++)
    {
        String sub = s.substring(i,i+length);
        if(i == 0)
        {
            smallest = sub;
        }
        if(sub.compareTo(largest)>0)
        {
            largest = sub;
        }
        else if(sub.compareTo(smallest)<0)
            smallest = sub;
    }
    System.out.println(smallest);
    System.out.println(largest);
}
}