// Sequence Input Stream
import java.io.*;
class file_handling9
{
    public static void main(String args[])throws IOException
    {
        SequenceInputStream inst=null;
        FileInputStream input1=null;
        FileInputStream input2=null;
        FileOutputStream fout=null;
        try
        {
            input1=new FileInputStream("C:/Users/pc/Documents/java/file handling/file1.txt");
            input2=new FileInputStream("C:/Users/pc/Documents/java/test.txt");
            fout=new FileOutputStream("C:/Users/pc/Documents/java/test1.txt");
            inst=new SequenceInputStream(input1,input2);
            int j;
            while((j=inst.read())!=-1)
            {
                System.out.print((char)j);
                fout.write(j);
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            inst.close();
            input1.close();
            input2.close();
        }
    }
}