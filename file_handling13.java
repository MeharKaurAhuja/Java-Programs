import java.io.*;
class file_handling13
{
    public static void main(String args[]) throws IOException
    {
        int i;
        String str="abcdefghijklmnopqrstuvwxyz";
        int n=str.length();
        char buffer[]=new char[n];
        str.getChars(7,n,buffer,7);
        CharArrayWriter ch=null;
        FileWriter f=null;
        try
        {
            ch=new CharArrayWriter();
            ch.write(buffer);
            f=new FileWriter("C:/Users/pc/Documents/java/file handling/b.txt");
            ch.writeTo(f);
            System.out.println("Work Completed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            ch.close();
            f.close();
        }
    }
}