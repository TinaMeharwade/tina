package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProblems2 {

    public static void main(String[] args)
    {
        System.out.println("Find the longest increasing subsequence(basic version).");
        List<Integer> lst = new ArrayList<>(List.of(10,9,2,5,3,7,101));

        int n = lst.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for(int i=1; i<lst.size();i++)
        {
            for(int j=0; j<i; j++)
            {
                if(lst.get(i)>lst.get(j))
                {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        System.out.println(Arrays.toString(dp));

        int max=0;
        for(int v : dp)
        {
            max=Math.max(max,v);
        }
        System.out.println(max);


        System.out.println("Find the longest consecutive sequence.");
//        List<Integer> lst = new ArrayList<>(List.of(10,9,10,11,12,8);

        int m = lst.size();
        int[] dpp = new int[m];
        Arrays.fill(dpp, 1);

        for(int i=1;i<lst.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                
            }
        }


        System.out.println("Check if ArrayList can be sorted by one swap.");

        System.out.println("Find all pairs with a given sum.");

        System.out.println("Find all triplets with a given sum.");

        System.out.println("Remove duplicates but keep last occurrence.");

        System.out.println("Merge two sorted ArrayLists.");

        System.out.println("Find the median of two sorted ArrayLists.");

        System.out.println("Rearrange positives and negatives alternately.");

        System.out.println("Find the smallest missing positive number.");
    }
}
