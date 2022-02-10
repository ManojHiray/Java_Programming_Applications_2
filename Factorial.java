import java.util.Scanner;

class Factorial 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter Number");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        int iRet = dobj.Factorial(iValue);
        System.out.println("Factorial is "+iRet);
    }    
}

class Demo
{
    public int Factorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
    
}
