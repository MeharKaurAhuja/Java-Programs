//Print Stream
import java.io.*;
import java.util.Date;
class file_handling10
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream fileOutputStream=null;
        PrintStream printStream=null;
        try
        {
            fileOutputStream=new FileOutputStream("C:/Users/pc/Documents/java/file handling/file1.txt");
            printStream=new PrintStream(fileOutputStream);
            printStream.print('A');
            printStream.print(100L);
            printStream.print(45.451);
            printStream.print(new Date());
            printStream.println();
            printStream.println("This is an example of Print Stream class");
            printStream.append('a');
            printStream.append("Append method of PrintStream");
            String str="Example Print Stream Class";
            byte b[]=str.getBytes();
            printStream.printf("This is a %s application ",str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(fileOutputStream!=null)
                {
                    fileOutputStream.close();
                }
                if(printStream!=null)
                {
                    printStream.close();
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}