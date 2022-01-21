import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter Number");
        iValue = sobj.nextInt();

        Marvelllous mobj = new Marvelllous();
        bRet = mobj.CheckPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }

}

class Marvelllous
{
    public boolean CheckPalindrome(int iNo)
    {
        int iDigit = 0, iRev = 0, iTemp = iNo;

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