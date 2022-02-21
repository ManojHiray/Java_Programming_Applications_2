/*
Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

import java.util.Scanner;
class Weird
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);
        int n = 0;

        System.out.println("Enter Number");
        n = sobj.nextInt();

        if(((n % 2) == 0) && (n >= 6 && n <=20) || ((n % 2) != 0))
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
    }
}
