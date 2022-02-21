// count Factorial containing Zeros

import java.util.Scanner;
class CountZeros
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner (System.in);

        int iNo = 0, iCnt = 0;
        System.out.println("Enter Number");
        iNo = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet = dobj.CountZero(iNo);
        System.out.println("Zeros Count is "+iRet);
    }
}

class Demo
{
    public int CountZero(int iNo)
    {
        int iCnt = 0, iFact = 1, Count = 0;
        int iDigit = 0;

        // Factorial Logic
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        //Check Zero and Count 
        while(iFact != 0)
        {
            iDigit = iFact % 10;
            if(iDigit == 0)
            {
                Count++;
            }
            iFact = iFact / 10;
        }
        return Count;
    }
}