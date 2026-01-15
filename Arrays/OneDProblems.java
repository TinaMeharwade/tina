package Arrays;
import java.util.Arrays;

public class OneDProblems {

    public static void main(String[] args)
    {
        //    Create an integer array of size 5 and print all elements.
        System.out.println("Create an integer array of size 5 and print all elements");
        int[] a = new int[]{1,2,3,4,5};
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        //    Print the length of an array.
        System.out.println("Print the length of an array.");
        System.out.println("Length of array a  : " + a.length);

        //    Print the first and last element of an array.
        System.out.println("Print the first and last element of an array.");
        int[] b = new int[]{1,5,8,0};
        System.out.println(b[0]);
        System.out.println("Prints index : " + (b.length - 1)); // prints 4 (index), not value //b.length = 4 and 4-1 = 3
        System.out.println("Prints value at index : " + (b[b.length-1])); //b.length = 4, b.length-1=4-1=3 and b[3] = 0

        //    Store 10 numbers and print them using: for loop and for-each loop
        //Loop Type	Variable Represents
        //for (int i = 0; ...)	Index
        //for (int x : array)	Value
        System.out.println("Store 10 numbers and print them using: for loop and for-each loop");
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<numbers.length; i++){
            System.out.println("Using for loop : " + numbers[i]);
        }
        for(int i : numbers)
        {
            System.out.println("using for each loop : "+ i);
        }

        //    Create a string array of 5 names and print each name.
        System.out.println("Create a string array of 5 names and print each name.");
        String[] string = new String[2];
        string = new String[]{"one", "two"};
        for(String s : string)
        {
            System.out.println(s);
        }

        int[] c = {0,1,2,3};
    }
}
