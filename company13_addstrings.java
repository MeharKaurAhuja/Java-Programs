import java.io.*;
import  java.util.*;

class company13_addstrings
{

	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
        String input2=sc.nextLine();
		String out="";
		int n1=input1.length();
		int n2=input2.length();
		int c1,c2,s1=0,s2=0;
        int c=input2.charAt(0);
		for(int i=0;i<n1;i++)
		{
			c1=(int)input1.charAt(i)-48;
			s1=s1*10+c1;
          //  System.out.println(s1);
		}
		for(int i=0;i<n2;i++)
		{
			c2=(int)input2.charAt(i)-48;
			s2=s2*10+c2;
		}
       // System.out.println(s1);
        System.out.println(c);
		int s=s1+s2;
		out=Integer.toString(s);
        System.out.println(out);
	}
	
}