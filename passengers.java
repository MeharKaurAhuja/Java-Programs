import java.util.*;
class passengers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,count=0;
        System.out.println("Enter total no. of passengers");
        int n=sc.nextInt();
        System.out.println("Enter the passengers age");
        int age[]=new int[n];
        for(i=0;i<n;i++)
        {
            age[i]=sc.nextInt();
        }
        System.out.println("Enter the gender of the passengers");
        char gender[]=new char[n];
        sc.nextLine();
        for(j=0;j<n;j++)
        {
            gender[i]=sc.nextLine();
        }
        for(j=0;j<n;j++)
        {
            if(gender[j].charAt(j)=='M'&&age[i]>60)
            {
                count++;
            }
            else if(gender[j].charAt(j)=='C')
            {
                count++;
            }
            else if(gender[j].charAt(j)=='F')
            {
                count++;
            }
            else
            {
                System.out.println("Invalid");
            }
            
                
        }
        
    }
}