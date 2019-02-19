import java.util.*;

public class file {
    public static void checkAnagram(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        char s3[]=s1.toCharArray();
        char s4[]=s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        for(int i=0;i<n1;i++)
        {
            System.out.println(s3[i]+" ");
        }
        if(n1==n2)
        {
            int c=1;
            for(int i=0;i<n1;i++)
            {
                if(s3[i]!=s4[i])
                {
                    c=0;
                    break;
                }
                
            }
            if(c==1)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
        else
        System.out.println("0");
    }
    public static void main(String args[])
	{
		int t;
		String str1,str2;
		
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			str1=sc.nextLine();			
			str2=sc.nextLine();
			checkAnagram(str1,str2);
		}
	}
}
