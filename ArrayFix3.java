/*Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. 
Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
In this version, 5's may appear anywhere in the original array.
#Input Array : [5, 4, 9, 4, 9, 5]
#Output Array : [9, 4, 5, 4, 5, 9]
*/

import java.util.*;

class ArrayFix3 
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);

       int Size = 0;
       int Arr[];
       
       System.out.println("Enter Size Of The Array :");
       Size = sobj.nextInt();

       Arr = new int[Size];

       System.out.println("Enter The Elements :");
       for(int i = 0; i < Arr.length; i++)
       {
           Arr[i] = sobj.nextInt();
       }

       Reusability robj = new Reusability();
       int Ret[] = robj.FixArray(Arr);

       System.out.println("The Output Array is :");
       for(int i = 0; i < Ret.length; i++)
       {
            System.out.print(Ret[i]+" ");
       }

    }    
}

class Reusability
{
    public int[] FixArray(int Arr[]) 
    {
        int index = 0, i = 0, j = 0;
        
        for(i = 0; i <= Arr.length-2; i++)
        {
            if(Arr[i]==4 && Arr[i+1]!=5)
            {
                for(j = index; j <= Arr.length-1; j++)
                {
                    if(Arr[j] == 5 && j == 0)
                    {
                        Arr[0] = Arr[i+1];
                        Arr[i+1] = 5;
                        index++;
                    }
                    if(Arr[j] == 5 && Arr[j-1] != 4)
                    {
                        Arr[j] = Arr[i+1];
                        Arr[i+1] = 5;
                        index = j;
                        break;
                    }
                }
            }
        }
        return Arr;
    }    
}


