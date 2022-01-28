import java.util.Scanner;

class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner (System.in);
        int iValue = 0;

        System.out.println("Enter number");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        boolean bRet = dobj.CheckPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }
}

class Demo
{
    public boolean CheckPalindrome(int iNo)
    {
        int iDigit = 0, iRev = 0;
        int iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
