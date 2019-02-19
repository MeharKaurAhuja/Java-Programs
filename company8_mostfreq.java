import java.util.*;
public class company8_mostfreq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int a1[]=new int[100];
		int rem,k=0;
		for(int i=0;i<n;i++)
		{
			while(a[i]!=0)
			{
				rem=a[i]%10;
				a1[k]=rem;
				k++;
				a[i]=a[i]/10;
			}
		}
		int c=0;
		int r=0;
		int a2[]=new int[100];
		for(int i=0;i<k;i++)
		{
			c=0;
			if(a1[i]!=-1)
			{
				for(int j=i+1;j<k;j++)
				{
					if(a1[i]==a1[j])
					{
						c++;
						a1[j]=-1;
					}
				}
				if(c!=0)
				{
					a2[r]=c+1;
					r++;
				}
			}
		}
		int max=a2[0];
		for(int i=0;i<r;i++)
		{
			if(max<a2[i])
				max=a2[i];
		}
		System.out.println(max);
    }
}

        