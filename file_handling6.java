import java.io.*;
class file_handling6
{
    public static void main(String args[]) throws IOException
    {
        ByteArrayOutputStream f= new ByteArrayOutputStream();
        String s="Content of Byte Array Output Stream";
        byte buffer[]=s.getBytes();
        f.write(buffer);
        char c;
        int j;
        System.out.println("buffer size "+f.size());
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        byte by[]=f.toByteArray();
        for(int i=0;i<by.length;i++)
        {
            c=(char)by[i];
            if(c>='a' && c<='z')
            {
                j=(int)c;
                j=j-32;
                System.out.print((char)j);
            }
            else
                System.out.print(c);
        }
        System.out.println();
        System.out.println("Into an OutputStream()");
        FileOutputStream f2=new FileOutputStream("./test1.txt");
        f.writeTo(f2);
        f.close();
    }
}