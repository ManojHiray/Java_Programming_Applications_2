import java.util.*;
 
class MergedArray 
{
    private static int[] MergedArray (int arrA[], int arrB[])
    {
        int[] mergedArray = new int[arrA.length + arrB.length];
         
        int i=0, j=0, k=0; 
                 
        while (i < arrA.length) 
        {
            mergedArray[k] = arrA[i];
            i++;
            k++;
        } 
                 
        while (j < arrB.length) 
        {
            mergedArray[k] = arrB[j];
            j++;
            k++;
        } 
             
        Arrays.sort(mergedArray);
         
        return mergedArray;
    }
     
    public static void main(String[] args) 
    {
        int[] arrA = new int[] {12, -7, 18, 9, 37, -1, 21};
         
        int[] arrB = new int[] {27, 8, 71, -9, 18};
         
        int[] mergedArray = MergedArray(arrA, arrB);
         
        System.out.println("Array A : "+Arrays.toString(arrA));
         
        System.out.println("Array B : "+Arrays.toString(arrB));
         
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
    }
}