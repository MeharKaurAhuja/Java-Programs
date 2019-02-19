import java.util.*;
class string_linear
{
    public static void main(String args[])
    {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String array[]=new String[n];
        sc.nextLine();
        System.out.println("Enter the elements in the array");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextLine();
        }
        System.out.println("Enter The element to be searched");
        String search=sc.nextLine();
        int flag=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].equals(search))
            {
                System.out.println("Element is found at "+(i+1)+" position");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element is not found");
        }
    }
}