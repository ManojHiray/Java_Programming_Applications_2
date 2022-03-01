import java.util.Scanner;

class Demo
{
    public boolean ChkAnagram(String str1, String str2)
    {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        boolean flag = false;

        if(arr1.length != arr2.length)
        {
            return flag;
        }
        else
        {
            for(int i = 0; i < arr1.length; i++)
            {
                flag = false;
                for(int j = 0; j < arr1.length; j++)
                {
                    if(arr1[i] == arr2[j])
                    {
                        flag = true;
                        break;
                    }
                }

                if(flag == false)
                {
                    break;
                }
            }
            return flag;
        }
    }
}

class StringAnagram
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String :");
        String str1 = sobj.nextLine();

        System.out.println("Enter Second String :");
        String str2 = sobj.nextLine();

        Demo dobj = new Demo();
        boolean bret = dobj.ChkAnagram(str1,str2);

        if(bret == false)
        {
            System.out.println("Strings are Not Anagrams");
        }
        else
        {
            System.out.println("Strings are Anagram");
        }
    }
}