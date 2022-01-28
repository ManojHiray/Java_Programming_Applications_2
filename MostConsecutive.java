import java.util.*;

class MostConsecutive
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        //int Arr[] = {3, 9, 1, 10, 4, 20, 2};
        int Size = 0;
        int Arr[];

        System.out.println("Enter Size");
        Size = sobj.nextInt();

        Arr = new int[Size];

        System.out.println("Enter elements of the array");
        for(int i = 0; i <Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        HashSet <Integer> hs = new HashSet<>();

        for(int i = 0; i < Arr.length; i++)
        {
            hs.add(Arr[i]);
        }

        int Long_leng = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(!hs.contains(Arr[i]-1))
            {
                int No = Arr[i];

                while(hs.contains(No))
                {
                    No++;
                }
                if(Long_leng < No-Arr[i])
                {
                    Long_leng = No-Arr[i];
                }
            }
        }
        System.out.println("Most Consecutive length is "+Long_leng);
    }
}

