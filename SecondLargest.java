import java.util.*;

class SecondLargest 
{
    public static void main(String[] args)
    {
        int Largest = 0, SecondLargest = 0;

        int arr[] = {9, 2, 1, 60 ,47};

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > Largest)
            {
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i] > SecondLargest)
            {
                SecondLargest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The 2nd Largest Element is "+SecondLargest);
    }    
}


