import java.io.*;
import java.util.Scanner;

class CountWhiteSpace 
{
    public static void main(String args[]) 
    {
        try 
        {

            File fobj = new File("Manoj.txt");

            Scanner sobj = new Scanner(fobj);

            int iSpace = 0;
            int iNo = 0;
            String sWord = "";

            while (sobj.hasNextLine()) 
            {
                sWord += sobj.nextLine();
            }
            iNo = sWord.length();

            iSpace = sWord.replace(" ", "").length();
            iSpace = iNo - iSpace;
            System.out.println("amount of white space is: " + iSpace);

        } 
        catch (FileNotFoundException e) 
            {
                System.out.print("File is not present");
                e.printStackTrace();
            }
    }
}