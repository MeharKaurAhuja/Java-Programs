import java.io.*;
class file_handling5
{
    public static void main(String args[]) throws IOException
    {
        ByteArrayOutputStream f= new ByteArrayOutputStream();
        String s="Content of Byte Array Output Stream";
        byte buffer[]=s.getBytes();
        f.write(buffer);
        System.out.println("buffer size "+f.size());
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        byte by[]=f.toByteArray();
        for(int i=0;i<by.length;i++)
        {
            System.out.print((char)by[i]);
        }
        System.out.println("Into an OutputStream()");
        FileOutputStream f2=new FileOutputStream("./test.txt");
        f.writeTo(f2);
        f.close();
    }
}