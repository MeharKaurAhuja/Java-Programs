import java.io.*;
class file_handling2
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fir=null;
        try
        {
            fir=new FileInputStream("C:/Users/pc/Documents/java/file handling/file1.txt");
            int i=0;
            while((i=fir.read())!=-1)
            {
                System.out.print((char)i);
            }
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