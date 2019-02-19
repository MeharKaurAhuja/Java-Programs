import java.util.*;
class count 
{ 
    public static long countSubStr(String sr,long n)  
    { 
        long res = 0;  // Initialize result 
  char str[]=sr.toCharArray();
        // Pick a starting point 
        for (int i = 0; i<n; i++)  
        { 
            if (str[i] == '1')  
            { 
                res++;
                // Search for all possible ending point 
                for (int j = i + 1; j< n; j++)  
                { 
                    if (str[j] == '1') 
                        res++; 
                } 
            } 
        } 
        return res; 
    } 
  
    // Driver program to test the above function 
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in); 
        long n = sc.nextLong();
        String str=sc.next();
        System.out.println(countSubStr(str,n)); 
    } 
} 