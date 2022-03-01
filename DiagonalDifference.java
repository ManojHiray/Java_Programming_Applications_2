import java.util.Scanner;

class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of Matrix :");
        int Row = sobj.nextInt();
        int Column = sobj.nextInt();

        int[][] Matrix = new int[Row][Column];

        System.out.println("Enter elements in Matrix");
        for(int i = 0; i < Matrix.length; i++)
        {
            for(int j = 0; j < Matrix.length; j++)
            {
                Matrix[i][j] = sobj.nextInt();
            }
        }

        Absolute_Difference obj = new Absolute_Difference();

        int iRet = obj.FindDiffrence(Matrix);

        System.out.println("Absolute difference between both the diagonals is :" +iRet);
    }
}

class Absolute_Difference
{
    public int FindDiffrence(int[][] arr)
    {
        int L_To_R_diagonal = 0 , R_To_L_diagonal = 0;

        for(int i = 0; i< arr.length-1;i++)
        {
            for(int j=0; j< arr.length; j++)
            {
                if(i == j)
                {
                    L_To_R_diagonal += arr[i][j];
                }

                if((i+j) == (arr.length-1))
                {
                    R_To_L_diagonal += arr[i][j];
                }
            }
        }   

        int absolute_diff = L_To_R_diagonal - R_To_L_diagonal;          
        
        if(absolute_diff < 0)
        {
            absolute_diff = -absolute_diff;
        }
        return absolute_diff;
    }
}