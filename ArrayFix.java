import java.util.*;

class ArrayFix 
{
    public static void main(String[] args)
    {
        int nums[] = {5,4,9,4,9,5};
        
        Demo dobj = new Demo();

        int[] ret = dobj.fix45(nums);
        System.out.println(Arrays.toString(ret));
    }
}

class Demo
{
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
