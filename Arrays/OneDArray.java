package Arrays;

import java.util.Arrays;

class OneDArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        int[] numbers = {1,2,3,4,5,6}; //Java internally converts it to new int[]{...}
        int[] arr2;
        arr2 = new int[]{10, 20, 30, 40, 50,60,70,80,90,100};

        int[] num = new int[3];
        num[0]=1;
        num[2]=0;
        int[] a = new int[]{}; //empty array
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        //int[] b = new int[5]{}; //not valid
        //you must choose only ONE way to initialize an array. Either specify the size. Or specify the values


        int len = arr1.length;
        System.out.println(len);
        System.out.println(numbers.length);
        System.out.println(num.length);
        System.out.println(num[2]);
        System.out.println(arr2.length);
        arr1 = new int[]{11,22};
        System.out.println(arr1[1]);


    }
}