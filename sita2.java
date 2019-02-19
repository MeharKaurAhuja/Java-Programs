import java.util.*;
class sita2
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
        char search=sc.next().charAt(0);
        int flag=0;
        for(int i=0;i<array.length;i++)
        {
            char c=array[i].charAt(0);
            if(c==search)
            {
                System.out.println("yes");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("no");
        }
    }
}