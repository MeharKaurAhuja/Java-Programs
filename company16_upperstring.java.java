import java.util.*;
class company16_upperstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.readLine();
		int n=s.length();
		String b="";
		int c=0;
		for(int i=0;i<n;i++)
		{
			while(s.charAt(i)==' ')
			{
				c=1;
				i=i+1;
				while(s.charAt(i)!=' ')
				{
					b+=s.charAt(i);
					i++;
				}
			}
		}
		if(c==1)
			b=b.toUpperCase();
		else
			b="LESS";
		System.out.println(b);
    }
}