import java.util.*;
public class company12_encodedarray
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
		int a1[]=new int[n];
		a1[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			a1[i]=a[i]-a1[i+1];
		}
		int k=a1[0];
		int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(a1[i]);
        }
		for(int i=0;i<n;i++)
		{
			sum=sum+a1[i];
		}
        //System.out.println(k);
        
    }
}