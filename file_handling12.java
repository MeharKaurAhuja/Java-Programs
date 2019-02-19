import java.io.*;
class file_handling12
{
    public static void main(String args[]) throws IOException
    {
        int i;
        String str="abcdefghijklmnopqrstuvwxyz";
        int n=str.length();
        char buffer[]=new char[n];
        str.getChars(7,n,buffer,8);
        CharArrayReader ch=null;
        try
        {
            ch=new CharArrayReader(buffer);
            while((i=ch.read())!=-1)
            {
                System.out.print((char)i+" ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            ch.close();
        }
    }
}