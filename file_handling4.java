import java.io.*;
class file_handling4
{
    public static void main(String args[]) throws IOException
    {
        int i;
        String str="abcdefghijklmnopqrstuvwxyz";
        byte buffer[]=str.getBytes();
        ByteArrayInputStream b=null;
        try
        {
            b=new ByteArrayInputStream(buffer);
            while((i=b.read())!=-1)
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
            b.close();
        }
    }
}