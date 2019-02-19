import java.io.*;
class file_handling1
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fir=null;
        try
        {
            fir=new FileInputStream("C:/Users/pc/Documents/java/file handling/file1.txt");
            int i=fir.read();
            System.out.println((char)i);
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
        finally
        {
            fir.close();
        }
    }
}