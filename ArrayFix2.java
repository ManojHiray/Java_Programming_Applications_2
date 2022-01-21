import java.util.*;

class ArrayFix2
{
     public static void main(String[] args)
     {
        int iSize = 0;
        int nums[];
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter size of the array");
        iSize = sobj.nextInt();
        nums = new int[iSize];
        System.out.println("Enter the elements");
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = sobj.nextInt();
        }
        int[] ret = fix45(nums);

        for(int i = 0; i < ret.length; i++)
        {
             System.out.print(ret[i]+" ");
        }

     }    
        
     public static int[] fix45(int[] nums) 
     {
         int index=0;
         for(int i=0;i<=nums.length-2;i++)
         {
             if(nums[i]==4 &&nums[i+1]!=5)
             {
                 for(int j=index;j<=nums.length-1;j++)
                 {
                     if(nums[j]==5 && j==0)
                     {
                         nums[0]=nums[i+1];
                         nums[i+1]=5;
                         index++;
                     }
                     if(nums[j]==5 && nums[j-1]!=4)
                     {
                         nums[j]=nums[i+1];
                         nums[i+1]=5;
                         index=j;
                         break;
                     }
                 }
             }
         }
         return nums;
     }
    
}