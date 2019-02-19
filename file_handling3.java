import java.io.*;
class file_handling3
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fir=null;
        int i=0;
        char c;
        byte b[]=new byte[20];
        int offset=4;
        int num=10;
        try
        {
            fir=new FileInputStream("C:/Users/pc/Documents/java/file handling/file1.txt");
            System.out.println("No. of bytes "+fir.available());
            i=fir.read(b,offset,num);
            System.out.println("No. of bytes read "+i);
            System.out.println("Bytes read");
            for(byte by:b)
            {
                c=(char)by;
                System.out.print(c);
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