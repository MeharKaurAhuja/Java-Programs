//Sequence Input Stream
import java.io.*;
class file_handling8
{
    public static void main(String args[]) throws IOException
    {
        String s1="Hello";
        String s2="World";
        byte[]b1=s1.getBytes();
        byte[]b2=s2.getBytes();
        ByteArrayInputStream is1=new ByteArrayInputStream(b1);
        ByteArrayInputStream is2=new ByteArrayInputStream(b2);
        SequenceInputStream sis=new SequenceInputStream(is1,is2);
        try
        {
            System.out.println(" "+sis.available());
            for(int i=0;i<10;i++)
            {
                char c=(char)sis.read();
                System.out.print(" "+c);
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            sis.close();
        }
    }
}
// try with resource mei finally ki zaroorat nhi apne aap file close ho jati hai 