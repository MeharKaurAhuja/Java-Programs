// You are using Java
import java.util.*;
import java.util.Arrays; 
public class jnext  
{ 
    static void swap(char ar[], int i, int j)  
    { 
        char temp = ar[i]; 
        ar[i] = ar[j]; 
        ar[j] = temp; 
    } 
    static void findNext(char ar[], int n)  
    { 
        int i; 
        for (i = n - 1; i > 0; i--)  
        { 
            if (ar[i] > ar[i - 1]) { 
                break; 
            } 
        } 
        if (i == 0)  
        { 
            System.out.println("Not possible"); 
        }  
        else 
        { 
            int x = ar[i - 1], min = i; 
            for (int j = i + 1; j < n; j++)  
            { 
                if (ar[j] > x && ar[j] < ar[min])  
                { 
                    min = j; 
                } 
            } 
            swap(ar, i - 1, min); 
            Arrays.sort(ar, i, n); 
            for (i = 0; i < n; i++) 
                System.out.print(ar[i]); 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n = sc.nextInt();
            char digits[]=new char[n];
            for(int i=0;i<n;i++)
            {
                digits[i]=sc.next().charAt(0);
            }
            findNext(digits, n);
            System.out.println();
            t--;
        }
    } 
} 
