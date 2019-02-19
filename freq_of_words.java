import java.util.*;
class freq_of_words
{
    public static void main(String args[])
    {
        int count=1,j,k;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String str="";
        String st="";
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==' ')
                i++;
            else
            {
                while(s.charAt(i)!=NULL)
                {
                    for(j=i;j<n && s.charAt(j)!=' ';j++)
                    {
                        str[j]=str[j]+s.charAt(j);
                        System.out.print(str[j]+" ");
                    }  
                    for(k=j+1;k<n;k++)
                    {
                        st[k]=st[k]+s.charAt(k);
                        if(s.charAt(k)==' ')
                        {
                            if(str[j].equals(st[k]))
                            {
                                count++;                        
                            }
                            else
                                k++;
                        }
                       // System.out.print(s[k]+" ");
                    }
                    i=j;
            }
            }
            
        }
        System.out.println(count);
    }
}