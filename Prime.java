import java.util.Scanner;

class Prime 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter Number");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        boolean bRet = dobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }    
}

class Demo
{
    public boolean CheckPrime(int iNo)
    {
        int i = 0, cnt = 0;

        for(i = 1; i <= iNo; i++)
        {
            if(iNo % i == 0)
            {
                cnt++;
            }
        }
        if(cnt == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}