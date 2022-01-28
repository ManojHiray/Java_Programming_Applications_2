import java.util.Scanner;

class Swap 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner (System.in);

        int iValue1 = 0, iValue2 = 0;
        System.out.println("Enter two numbers");
        iValue1 = sobj.nextInt();
        iValue2 = sobj.nextInt();
        System.out.println("The Enterd number is "+iValue1+" "+iValue2);
        Demo dobj = new Demo();
        dobj.Swap(iValue1, iValue2);
    }    
}

class Demo
{
    public void Swap(int iNo1, int iNo2)
    {
        int iTemp =  0;

    //    iNo1=iNo1+iNo2;
    //    iNo2=iNo1-iNo2;
    //    iNo1=iNo1-iNo2;
        iTemp = iNo1;
        iNo1 = iNo2;
        iNo2 = iTemp;
       System.out.println("The Swapped Number is "+ iNo1 +" "+iNo2);
    }
}

