import java.util.*;
public class freq
{
public static void countFreq(int a[],int n)
{
    int count=1;
    for(int i=0;i<n;i++)
    {
        count=1;
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j]&&a[i]!=0)
            {
                a[j]=0;
                count++;
            }
        }
        if(a[i]!=0)
        System.out.println(a[i]+" occurs "+count+" times");
    }
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    countFreq(arr,n);
}
}