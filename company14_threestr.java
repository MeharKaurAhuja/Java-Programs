import java.io.*;
import  java.util.*;
public class company14_threestr
{	
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        String input3=sc.nextLine();
        int n1=input1.length();
		int n2=input2.length();
		int n3=input3.length();
		int s1=n1;
		int s2=n2;
		int s3=n3;
		int c=1;
		String f1="",m1="",e1="",f2="",m2="",e2="",f3="",m3="",e3="";
		if(n1%3==0)
		{
			n1=s1/3;
			for(int i=0;i<s1;i++)
			{
			     if(c<=n1)
				 {
					 f1=f1+input1.charAt(i);
					 c++;
				 }
				else if(c<=(2*n1))
				{
					m1=m1+input1.charAt(i);
					c++;
				}
				else
				{
					e1=e1+input1.charAt(i);
				}
			}
		}
		else if(n1%3==1)
		{
			n1=s1/3;
			for(int i=0;i<s1;i++)
			{
			     if(c<=n1 ||s1==1)
				 {
					 f1=f1+input1.charAt(i);
					 c++;
				 }
				else if(c<=((2*n1)+1))
				{
					m1=m1+input1.charAt(i);
					c++;
				}
				else
				{
					e1=e1+input1.charAt(i);
				}
			}
		}
		else 
		{
			n1=s1/3;
			for(int i=0;i<s1;i++)
			{
			     if(c<=n1+1)
				 {
					 f1=f1+input1.charAt(i);
					 c++;
				 }
				else if(c<=(2*n1+1) ||s1==2)
				{
					m1=m1+input1.charAt(i);
					c++;
				}
				else
				{
					e1=e1+input1.charAt(i);
				}
			}
		}
		c=1;
		if(n2%3==0)
		{
			n2=s2/3;
			for(int i=0;i<s2;i++)
			{
			     if(c<=n2)
				 {
					 f2=f2+input2.charAt(i);
					 c++;
				 }
				else if(c<=(2*n2))
				{
					m2=m2+input2.charAt(i);
					c++;
				}
				else
				{
					e2=e2+input2.charAt(i);
				}
			}
		}
		else if(n2%3==1)
		{
			n2=s2/3;
			for(int i=0;i<s2;i++)
			{
			     if(c<=n2 ||s2==1)
				 {
					 f2=f2+input2.charAt(i);
					 c++;
				 }
				else if(c<=((2*n2)+1))
				{
					m2=m2+input2.charAt(i);
					c++;
				}
				else
				{
					e2=e2+input2.charAt(i);
				}
			}
		}
		else 
		{
			n2=s2/3;
			for(int i=0;i<s2;i++)
			{
			     if(c<=n2+1)
				 {
					 f2=f2+input2.charAt(i);
					 c++;
				 }
				else if(c<=(2*n2+1) ||s2==2)
				{
					m2=m2+input2.charAt(i);
					c++;
				}
				else
				{
					e2=e2+input2.charAt(i);
				}
			}
		}
		c=1;
		if(n3%3==0)
		{
			n3=s3/3;
			for(int i=0;i<s3;i++)
			{
			     if(c<=n3)
				 {
					 f3=f3+input3.charAt(i);
					 c++;
				 }
				else if(c<=(2*n3))
				{
					m3=m3+input3.charAt(i);
					c++;
				}
				else
				{
					e3=e3+input3.charAt(i);
				}
			}
		}
		else if(n3%3==1)
		{
			n3=s3/3;
			for(int i=0;i<s3;i++)
			{
			     if(c<=n3 ||s3==1)
				 {
					 f3=f3+input3.charAt(i);
					 c++;
				 }
				else if(c<=((2*n3)+1))
				{
					m3=m3+input3.charAt(i);
					c++;
				}
				else
				{
					e3=e3+input3.charAt(i);
				}
			}
		}
		else
		{
			n3=s3/3;
			for(int i=0;i<s3;i++)
			{
			     if(c<=n3+1)
				 {
					 f3=f3+input3.charAt(i);
					 c++;
				 }
				else if(c<=(2*n3+1) ||s3==2)
				{
					m3=m3+input3.charAt(i);
					c++;
				}
				else
				{
					e3=e3+input3.charAt(i);
				}
			}
		}	
		String output1="",output2="",output3="";
        output1=f1+f2+f3;
		output2=m1+m2+m3;
		output3=e1+e2+e3;
        int ch;
        String b="";
        for(int i=0;i<output3.length();i++)
        {
            ch=(int)output3.charAt(i);
            if(ch>=65&&ch<=90)
                b+=(char)(ch+32);
            else if(ch>=97&&ch<=122)
                b+=(char)(ch-32);
        }
		//System.out.println(output1);
        //System.out.println(output2);
        System.out.println(b);
    }
}

/*
import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public class Result{
		public final String output1;
		public final String output2;
		public final String output3;

		public Result(String out1, String out2, String out3){
			output1 = out1;
			output2 = out2;
			output3 = out3;
		}
	}
	
    public Result encodeThreeStrings(String input1,String input2,String input3){
    	// Read only region end
        //Write code here...
        int n1=input1.length();
		int n2=input2.length();
		int n3=input3.length();
		int s1=n1;
		int s2=n2;
		int s3=n3;
		int c=1;
		String f1="",m1="",e1="",f2="",m2="",e2="",f3="",m3="",e3="";
		if(n1%3==0)
		{
			n1=s1/3;
			for(int i=0;i<s1;i++)
			{
			     if(c<=n1)
				 {
					 f1=f1+input1.charAt(i);
					 c++;
				 }
				else if(c<=(2*n1))
				{
					m1=m1+input1.charAt(i);
					c++;
				}
				else
				{
					e1=e1+input1.charAt(i);
				}
			}
		}
		else if(n1%3==1)
		{
			n1=s1/3;
			for(int i=0;i<s1;i++)
			{
			     if(c<=n1 ||s1==1)
				 {
					 f1=f1+input1.charAt(i);
					 c++;
				 }
				else if(c<=((2*n1)+1))
				{
					m1=m1+input1.charAt(i);
					c++;
				}
				else
				{
					e1=e1+input1.charAt(i);
				}
			}
		}
		else 
		{
			n1=s1/3;
			for(int i=0;i<s1;i++)
			{
			     if(c<=n1+1)
				 {
					 f1=f1+input1.charAt(i);
					 c++;
				 }
				else if(c<=(2*n1+1) ||s1==2)
				{
					m1=m1+input1.charAt(i);
					c++;
				}
				else
				{
					e1=e1+input1.charAt(i);
				}
			}
		}
		c=1;
		if(n2%3==0)
		{
			n2=s2/3;
			for(int i=0;i<s2;i++)
			{
			     if(c<=n2)
				 {
					 f2=f2+input2.charAt(i);
					 c++;
				 }
				else if(c<=(2*n2))
				{
					m2=m2+input2.charAt(i);
					c++;
				}
				else
				{
					e2=e2+input2.charAt(i);
				}
			}
		}
		else if(n2%3==1)
		{
			n2=s2/3;
			for(int i=0;i<s2;i++)
			{
			     if(c<=n2 ||s2==1)
				 {
					 f2=f2+input2.charAt(i);
					 c++;
				 }
				else if(c<=((2*n2)+1))
				{
					m2=m2+input2.charAt(i);
					c++;
				}
				else
				{
					e2=e2+input2.charAt(i);
				}
			}
		}
		else 
		{
			n2=s2/3;
			for(int i=0;i<s2;i++)
			{
			     if(c<=n2+1)
				 {
					 f2=f2+input2.charAt(i);
					 c++;
				 }
				else if(c<=(2*n2+1) ||s2==2)
				{
					m2=m2+input2.charAt(i);
					c++;
				}
				else
				{
					e2=e2+input2.charAt(i);
				}
			}
		}
		c=1;
		if(n3%3==0)
		{
			n3=s3/3;
			for(int i=0;i<s3;i++)
			{
			     if(c<=n3)
				 {
					 f3=f3+input3.charAt(i);
					 c++;
				 }
				else if(c<=(2*n3))
				{
					m3=m3+input3.charAt(i);
					c++;
				}
				else
				{
					e3=e3+input3.charAt(i);
				}
			}
		}
		else if(n3%3==1)
		{
			n3=s3/3;
			for(int i=0;i<s3;i++)
			{
			     if(c<=n3 ||s3==1)
				 {
					 f3=f3+input3.charAt(i);
					 c++;
				 }
				else if(c<=((2*n3)+1))
				{
					m3=m3+input3.charAt(i);
					c++;
				}
				else
				{
					e3=e3+input3.charAt(i);
				}
			}
		}
		else
		{
			n3=s3/3;
			for(int i=0;i<s3;i++)
			{
			     if(c<=n3+1)
				 {
					 f3=f3+input3.charAt(i);
					 c++;
				 }
				else if(c<=(2*n3+1) ||s3==2)
				{
					m3=m3+input3.charAt(i);
					c++;
				}
				else
				{
					e3=e3+input3.charAt(i);
				}
			}
		}	
		String output1="",output2="",output3="";
        output1=f1+f2+f3;
		output2=m1+m2+m3;
		output3=e1+e2+e3;
		int ch;
        String b="";
        for(int i=0;i<output3.length();i++)
        {
            ch=(int)output3.charAt(i);
            if(ch>=65&&ch<=90)
                b+=(char)(ch+32);
            else if(ch>=97&&ch<=122)
                b+=(char)(ch-32);
        }
		UserMainCode u=new UserMainCode();
		UserMainCode.Result res=u.new Result(output1,output2,b);
		return res;
    }
}
*/