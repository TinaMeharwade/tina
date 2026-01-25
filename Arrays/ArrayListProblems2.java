package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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


        System.out.println("\nFind the longest consecutive sequence.");
//        List<Integer> lst = new ArrayList<>(List.of(10,9,10,11,12,8);

        List<Integer> list = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2));
        int currCount=1;
        int longest=1;
        Collections.sort(list); //1,2,3,4,100,200

        for(int i=1; i<list.size();i++)
        {
            if(list.get(i).equals(list.get(i-1)))
            {
                continue;
            }
            if(list.get(i)==list.get(i-1)+1)
            {
                currCount++;
            }
            else{
                currCount=1;
            }
            longest=Math.max(longest, currCount);

        }
        System.out.println("Longest consecutive sequence : " + longest);

        System.out.println("\nCheck if ArrayList can be sorted by one swap.");
        List<Integer> list1 = new ArrayList<>(List.of(1,5,2,4,3));
        List<Integer> sorted = new ArrayList<>(list1);
        Collections.sort(sorted);
        int diff=0;
        for(int i=0;i<list1.size();i++)
        {
            if(!list1.get(i).equals(sorted.get(i)))
            {
                diff++;
            }
        }
        if(diff==0||diff==2)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        System.out.println("\nFind all pairs with a given sum.");
        List<Integer> list2 = new ArrayList<>(List.of(1, 5, 7, -1, 5));
        int target = 6;
        for(int i=0; i<list2.size(); i++)
        {
            for(int j=i+1; j<list2.size();j++)
            {
                int sum = list2.get(i)+list2.get(j);
                if(sum==target)
                {
                    System.out.println(list2.get(i) + " " + list2.get(j));
                }
            }
        }

        System.out.println("\nFind all triplets with a given sum.");
        int needed = 0;
        List<Integer> lst2 = new ArrayList<>(List.of(1, 2, -2, 0, -1, 1));
        Collections.sort(lst2);
        //-2 -1 0 1 2

        for(int i=0;i<lst2.size()-2;i++) {

            int left=i+1;
            int right=lst2.size()-1;

            while(left<right)
            {
                int sum = lst2.get(i) + lst2.get(left) + lst2.get(right);

                if(sum==needed)
                {
                    System.out.println(lst2.get(i) + " " + lst2.get(left) + " " + lst2.get(right) + " ");
                    left++;
                    right--;
                }
                else if(sum<needed)
                {
                    left++;
                }else{
                    right--;
                }
            }
        }


        System.out.println("\nRemove duplicates but keep last occurrence.");

        System.out.println("\nMerge two sorted ArrayLists.");
        List<Integer> l1 = new ArrayList<>(List.of(1,3,5));
        List<Integer> l2 = new ArrayList<>(List.of(2,4,6));
        List<Integer> merged = new ArrayList<>();
        int i=0, j=0;
        while(i<l1.size()&&j<l2.size())
        {
            if(l1.get(i)<=l2.get(j))
            {
                merged.add(l1.get(i++));
            }else{
                merged.add(l2.get(j++));
            }
        }
        while (i < l1.size()) merged.add(l1.get(i++));
        while (j < l2.size()) merged.add(l2.get(j++));

        System.out.println(merged);

        System.out.println("\nFind the median of two sorted ArrayLists.");

        System.out.println("\nRearrange positives and negatives alternately.");

        System.out.println("\nFind the smallest missing positive number.");
    }
}
