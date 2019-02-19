import java.util.*;
class pattern_lastdig_rotate
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();            
        }
        for(int i=0;i<size;i++)
        {
            for (int k=size-i;k<=size;k++) 
            { 
                System.out.print(k+" ");
            } 
            for (int j=1;j<size-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            count++;
        }
        System.out.print("No. of turns = "+count);
    }
}
