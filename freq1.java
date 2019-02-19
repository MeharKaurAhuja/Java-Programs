import java.util.*;
class freq1
{
    public static void main(String args[])
    {
        int count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of passengers");
        int n=sc.nextInt();
        if(n>0)
        {
        char arr[]=new char[n];
        sc.nextLine();
        System.out.println("Enter the nationality of passengers in uppercase");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
            if(arr[i]>='a' && arr[i]<='z')
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    arr[j]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            count=1;
            if(arr[i]!=0)
            {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>='A' && arr[j]<='Z')
                {
                    break;
                }
                else
                    count++;
            } 
            System.out.println(arr[i]+" "+count);
            }
        }        
    }
    else
    {
        System.out.println("Invalid Input");
    }
    }
}