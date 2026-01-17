package Arrays;

import java.util.Arrays;

public class TwoDArray {

//    static int[][] a = { {1,2,3}, {4,5,6} };
    int[][] a = { {1,2,3}, {4,5,6} };
    public static void main(String[] args)
    {
        TwoDArray obj = new TwoDArray();
        for(int i=0; i<obj.a.length; i++)
        {
            for(int j=0;j<obj.a[i].length;j++)
            {
                System.out.print(obj.a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
