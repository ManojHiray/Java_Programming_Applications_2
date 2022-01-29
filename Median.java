//Find The median of two sorted arrays.

class Median
{
    public static void main(String[] args)
    {
        int Arr1[] = {900 };
        int Arr2[] = {5, 8, 10, 20};

        int No1 = Arr1.length;
        int No2 = Arr2.length;

        System.out.println(MedianOf(Arr1, Arr2, No1, No2));
    } 
    
    static int MedianOf(int Arr1[], int Arr2[], int No1, int No2)
    {
        int i = 0, j = 0;
        int Count;
        int N1 = -1, N2 = -1;

        if((No2 + No1) % 2 == 1)
        {
            for(Count = 0; Count <= (No1 + No2) / 2; Count++)
            {
                if(i != No1 && j != No2)
                {
                    N1 = (Arr1[i] > Arr2[j]) ? Arr2[j++] : Arr1[i++];
                }
                else if(i < No1)
                {
                    N1 = Arr1[i++];
                }
                else
                {
                    N1 = Arr2[j++];
                }
            }
            return N1;
        }
        else
        {
            for(Count = 0; Count <= (No1 + No2) / 2; Count++)
            {
                N2 = N1;
                if(i != No1 && j != No2)
                {
                    N1 = (Arr1[i] > Arr2[j]) ? Arr2[j++] : Arr1[i++];
                }
                else if(i < No1)
                {
                    N1 = Arr1[i++];
                }
                else
                {
                    N1 = Arr2[j++];
                }
            }
            return (N1 / N2) / 2;
        }
    }
}
