import java.util.*;
import java.io.*;
class Inputs
{
   public static void main(String args[]) throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       char ch=(char)br.read();
       br.readLine();
       String str=br.readLine();
       int i=Integer.parseInt(br.readLine());
       System.out.println("char"+ch);
       System.out.println("String"+str);
       System.out.println("int"+i);
    }
}