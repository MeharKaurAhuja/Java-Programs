import java.util.*;
class company6_sumofdigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int input1=n;
		int a[]=new int[100];
		int c=0,rem;
		for(int i=0;n!=0;i++)
		{
			rem=n%10;
			a[i]=rem;
			n=n/10;
			c++;
		}
		n=input1;
		int m=c-1;
		int a1[]=new int[100];
		for(int i=0;i<c;i++)
		{
			a1[i]=a[m];
			m--;
        }
		int sum=0;
		for(int i=0;i<c;i++)
		{
			for(int j=i;j<c;j++)
				sum=sum+a1[j];
            //System.out.println(sum);
		}
		System.out.println(sum);
	}
}
        

/*int b=1,s=0,rem,sum=0,rem1;
        while(n!=0)
        {
            rem=n%10;
            s=s*10+rem;
            n=n/10;
        }
        int num=s;
        while(num!=0)
        {
            int n1=num;
            while(n1!=0)
            {
                rem1=n1%10;
                sum=sum+rem1;
                n1=n1/10;
            }
            num=num/10;

        }*/