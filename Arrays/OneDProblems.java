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

//        Find the sum of all elements in an array.
        int[] elements = new int[]{10,40,13,3,20};
        int sum = 0;
        for(int ele : elements){
            sum = sum + ele;
        }
        System.out.println("sum of all elements in an array : " + sum);

//        Find the average of array elements.
        double avg = 0.0;
        int sum2 = 0;
        for (int e : elements){
            sum2=sum2+e;
        }
        avg = (double) sum2/(elements.length);
        System.out.println("average of array elements : " + avg);

//        Count how many numbers are even and odd.
        int evenCnt = 0, oddCnt = 0;
        for(int e : elements){
            if((e%2)==0)
            {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        System.out.println("Even numbers count : " + evenCnt);
        System.out.println("Odd numbers count : " + oddCnt);


//        Find the largest element in an array.
        // int[] elements = new int[]{10,40,13,3,20};
        int largest = elements[0];
        for(int i=1;i<elements.length;i++){
            if(elements[i]>largest)
            {
                largest=elements[i];
            }
        }
        System.out.println("largest element in array : " + largest);

//        Find the smallest element in an array.
        int smallest = elements[0];
        for(int i=1;i<elements.length;i++){
            if(elements[i]<smallest)
            {
                smallest=elements[i];
            }
        }
        System.out.println("smallest element in array : " + smallest);

//        Reverse an array.
        int[] array1 = new int[]{1,2,3,10,4,5};
        int start=0;
        int end = array1.length-1;
        while(start < end)
        {
            int temp = array1[start];
            array1[start]=array1[end];
            array1[end]=temp;

            start++;
            end--;

        }
        System.out.println("reversed array : ");
        for(int arr : array1)
        {
            System.out.print(arr+" ");
        }

//        Copy elements from one array to another.
        System.out.println("\nCopy elements from one array to another : " );
        System.out.println("Original array : " );
        for(int temp : array1){
            System.out.print(temp+" ");
        }
        // int[] array1 = new int[]{1,2,3,10,4,5};
        int[] array2 = new int[array1.length];
        for(int i=0;i<array1.length;i++)
        {
            array2[i]=array1[i];
        }
        System.out.println("\nCopied array : ");
        for(int temp : array2){
            System.out.print(temp+" ");
        }

//        Check if a given element exists in the array (linear search).
        // 5 4 10 3 2 1
        int toSearch=1;
        int flag=0;
        for (int j : array1) {
            if (toSearch == j) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("\n"+toSearch + " is element found in array");
        }else {
            System.out.print("\n"+toSearch + " is element that does not exist in array");

        }

//        Count how many times a number appears in the array.
        int[] arrnum = new int[]{5,1,3,8,1,5,7,5,3};
        int toCnt=5;
        int cnt=0;
        for(int i : arrnum)
        {
            if(toCnt==i)
            {
                cnt++;
            }
        }
        System.out.println("\nThe number " + toCnt + " appears " + cnt + " times in givan array");

//        Replace all negative numbers with 0.
        int[] arr3 = new int[]{0,-3,2,3,8,-8,-1,-9,6,-4,8,-1};
        System.out.println("Before replacing -ve numbers with 0 array is : ");
        for(int i : arr3)
        {
            System.out.print(" " + i);
        }

//        In a for-each loop, k is a copy of the value. Changing k does NOT change the array
//        So even though you write k = 0, the actual array arr3 remains unchanged. Hence, for each loop won't work
//        for(int k : arr3)
//        {
//            if(k<0)
//            {
//                k=0;
//            }
//        }
//        What Java actually does internally (conceptually):
//        int[] arr = {1, 2, 3};
//        for (int x : arr) {
//            x = 0;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int x = arr[i];   // COPY of value
//            x = 0;            // changes only the copy
//        }
//        x is just a temporary variable
//        Changing x does NOT change arr[i]
        for(int k=0;k<arr3.length;k++)
        {
            if(arr3[k]<0)
            {
                arr3[k]=0;
            }
        }
        System.out.println("\nAfter replacing -ve numbers with 0 array is : ");
        for(int i : arr3)
        {
            System.out.print(" " + i);
        }
    }
}

//https://github.com/TinaMeharwade/tina/tree/Array/Arrays