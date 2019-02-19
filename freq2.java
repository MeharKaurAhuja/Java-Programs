import java.util.*;
class freq2
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of passengers");
        int size=sc.nextInt();
        if(size>0)
        {
        int array[]=new int[size];
        char arr[]=new char[size];
        sc.nextLine();
        System.out.println("Enter the age of passengers");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
            if(array[i]<=0)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        System.out.println("Enter the category of passengers,i.e., F, M or C");
       
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next().charAt(0);
            if(arr[i]=='F')
            {
                count++;
            }
            else if(arr[i]=='C')
            {
                count++;
            }
            else if(arr[i]=='M' && array[i]>60)
            {
                count++;
            }
            else if(arr[i]=='M')
            {
                continue;
            }
            else
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        System.out.println(count);
        }
        else
            System.out.println("Invalid Input");
    }
}