import java.util.*;
class company16_upperstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[100];
        int rem;
        int i=0;
        if(a==0)
        {
            arr[i]=a;
            i++;
            
        }
        if(b==0)
        {
            arr[i]=a;
            i++;
            
        }
        if(c==0)
        {
            arr[i]=a;
            i++;
            
        }
        if(d==0)
        {
            arr[i]=a;
            i++;
            
        }
        while(a!=0)
        {
            rem=a%10;
            arr[i]=rem;
            a=a/10;
            i++;
        }
        while(b!=0)
        {
            rem=b%10;
            arr[i]=rem;
            b=b/10;
            i++;
        }
        while(c!=0)
        {
            rem=c%10;
            arr[i]=rem;
            c=c/10;
            i++;
        }
        while(d!=0)
        {
            rem=d%10;
            arr[i]=rem;
            d=d/10;
            i++;
        }
        int n=i;
        
        for(int k=0;k<n;k++)
        {
            for(int j=0;j<n-k-1;j++)
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        
        int count,c1=0,max=0;
        for(i=0;i<n;i++)
        {
            count=1;
            if(arr[i]!=-1)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                if(count>=c1)
                {
                    max=arr[i];
                    c1=count;
                } 
            }
    }
        System.out.println();
        System.out.print(max);
}
}
   

        
/*
String s=sc.nextLine();
		int n=s.length();
		String b="";
		int c=0;
		for(int i=0;i<n;i++)
		{
            c=0;
            if(s.charAt(i+1)==' ')
            {
                c=1;
                while(s.charAt(i+2)!=' ' && (i+2<=(n-1)))
                {
                    b=b+s.charAt(i+2);
                    i++;
                    //System.out.print(b);
                }
                i++;
                break;
            }
		}
		if(c==1)
			b=b.toUpperCase();
		else
			b="LESS";
		System.out.println(b);
*/