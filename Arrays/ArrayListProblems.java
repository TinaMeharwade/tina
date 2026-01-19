package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProblems {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(101);
        lst.add(500);
        lst.add(1);
        System.out.println(lst);
        System.out.println("\nFind the largest element in an ArrayList.");
        int largest = lst.getFirst();
        for(int i=1;i<lst.size();i++)
        {
            if(lst.get(i)>largest)
            {
                largest = lst.get(i);
            }
        }
        System.out.println("Largest element in array list is : " + largest);

        System.out.println("Find the smallest element.");
        int smallest = lst.getFirst();
        for(int i=1;i<lst.size();i++)
        {
            if(lst.get(i)<smallest)
            {
                smallest=lst.get(i);
            }
        }
        System.out.println("Smallest element in array list is : " + smallest);

        System.out.println("\nFind the sum of all elements.");
        int sum = 0;
        for(int n : lst)
        {
            sum+=n;
        }
        System.out.println("Sum of all the elements in ArrayList : " + sum);

        System.out.println("\nFind the average of elements.");
        double avg=0.0, sum1=0.0;
        int cnt = 0;
        for(int n: lst)
        {
            sum1+=n;
            cnt++;
        }
        System.out.println("Total elements in ArrayList : " + cnt);
        avg=sum1/cnt;
        System.out.println("Average of ArrayList elements : " + avg);

        System.out.println("\nCount even and odd numbers.");
        int evenCnt = 0;
        int oddCnt = 0;
        for(int n : lst)
        {
            if(n%2==0)
            {
                evenCnt++;
            }
            else {
                oddCnt++;
            }
        }
        System.out.println("Even elements count : " + evenCnt);
        System.out.println("Odd elements count : " + oddCnt);

        System.out.println("\nReverse an ArrayList.");
        System.out.println(lst);
//        System.out.println(lst.reversed());
//        [10, 101, 500, 1]
        int start=0;
        int end=lst.size()-1;
        while(start < end)
        {
            int temp = lst.get(start);
            lst.set(start, lst.get(end));
            lst.set(end, temp);
            start ++;
            end --;
        }
        System.out.println("Reversed arraylist : " + lst);

        System.out.println("\nRemove all duplicate elements.");
        List lst2 = new ArrayList<>(List.of(1,2,3,1,5,1));
        System.out.println(lst2);
        for(int i=0;i<lst2.size();i++)
        {
            for(int j=i+1;j<lst2.size();j++)
            {
                if(lst2.get(i).equals(lst2.get(j)))
                {
                    lst2.remove(j);
                    j--;  //imp Why j--? Because after remove(j), elements shift left.
                }
            }
        }
        System.out.println(lst2);

        System.out.println("\nCount how many times a number appears.");
        List lst3 = new ArrayList<>(List.of(1,2,3,1,5,1,2,1,3,2,5,2));
        int toCnt=2;
        int cnt1=0;
        for(int i=0; i<lst3.size();i++)
        {
            if(lst3.get(i).equals(toCnt))
            {
                cnt1++;
            }
        }
        System.out.println("2 appeared " + cnt1 + " times in given arraylist");

        System.out.println("\nMerge two ArrayLists.");

        System.out.println("\nFind the second largest element.");
    }
}
