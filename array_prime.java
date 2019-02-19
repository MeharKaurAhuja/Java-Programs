import java.util.*;
class array_prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of elements");
        int size=sc.nextInt();
        int n[]=new int[size];
        sc.nextLine();
        int k;
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(n[i]==n[j])
                    n[j]=0;
            }
        }
        
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(n[i]!=0 && n[j]!=0)
                {
                    k=n[i]+n[j];
                    int flag=0;
                    for(int r=2;r<=k/2;r++)
                    {
                        if(k%r==0)
                        {
                            flag=1;
                            break;
                        }
                        else
                        {
                            flag=0;
                        }
                    }
                    if(flag==0)
                        System.out.println("Sum of "+n[i]+" "+n[j]+" is "+k+" which is prime");
                }
            }
        }
    }
}