import java.io.*;
import  java.util.*;
class company15_posswords
{

	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String out="",b="";
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		int n=s2.length();
        int n1=s1.length();
        char d=':';
        int c=0;
		for(int i=0;i<n;i++)
		{
                c=0;
                out="";
                for(int j=0;j<n1;j++)
                {
                    if(s2.charAt(i)!=':')
                    {
                        if(s1.charAt(j)=='_')
                        {
                            out+=s2.charAt(i);
                            i++;
                            c++;
                        }
                        else if(s1.charAt(j)==s2.charAt(i))
                        {
                            out+=s2.charAt(i);
                            i++;
                            c++;
                        }
                        else
                            break;
                    }
                }
                if(c==n1 && s2.charAt(i)==':')
                {
                    b=b+out;
                    b=b+d;
                }  					
		}
        
		if(b.length()>0)
		    b = b.substring(0, b.length()-1);
		else
			b="ERROR-009";
		System.out.println(b);
		
	}
}