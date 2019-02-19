import java.io.*;
class CaseChange
{
static String n;
static int l;
 public static void main(String args[]) throws IOException
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter a String : ");
 n = br.readLine();
 l = n.length();
 changeCase();
 }
 public static void changeCase()
 {
 char c;
 String b = "";
 for(int i=0;i<l;i++)
 {
  c = n.charAt(i);
  if(c>=65 && c<=90)
  b+=(char)(c+32);
  else
  if(c>=97 && c<=122)
  b+=(char)(c-32);
  else
  b+=c;
 }
 System.out.println("\nOriginal : " +n);
 System.out.println("Changed : " +b);
 }
 }