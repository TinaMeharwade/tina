package Arrays;

public class TwoDArrayProblems {
    static int[][] arr = new int[3][4];

    public static void main(String[] args) {

        arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {10, 20, 30}
        };

        System.out.println("\nCreate a 2D array and print all elements : ");

//        for(int i=0;i<arr.length;i++)  //arr.length = row
//        {
//            for(int j=0;j<arr[i].length;j++)  //arr[i].length = column
//            {
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] row : arr) //int[] row = one full row
        {
            for (int value : row)  //value → each element inside that row
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\nPrint the number of rows and columns.");
        int rowCnt = arr.length;
        int colCnt = arr[0].length;
        System.out.println("Number of rows in givem matrix : " + rowCnt + "\nNumber of columns in given matrix : " + colCnt);

        System.out.println("------For jagged arrays------");
        arr = new int[][]{
                {4, 6},
                {10, 20, 30, 4}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("row : " + i + " columns : " + arr[i].length);
        }


        System.out.println("\nPrint elements row-wise.");
        arr = new int[][]{
                {11, 12, 33},
                {4, 5, 6},
                {10, 20, 30}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Row : " + i + " elements : ");
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("}");
            System.out.println();
        }

        System.out.println("Print elements column-wise.");
//        arr = new int[][]{
//                {11, 12, 33},
//                {4, 5, 6},
//                {10, 20, 30}
//        };
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
        System.out.println("For jagged array");
        arr = new int[][]{
                {11, 12},
                {4, 5, 6, 0, 1},
                {10, 20, 30},
                {2}
        };

        int maxCols = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxCols < arr[i].length) {
                maxCols = arr[i].length;
            }
        }

        for (int i = 0; i < maxCols; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arr.length; j++) {
                if (i < arr[j].length) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.print("}");
            System.out.println();
        }

        System.out.println("\nFind the sum of all elements in a 2D array.");
        int sum = 0;
        arr = new int[][]{
                {11, 12, 33},
                {4, 5, 6},
                {10, 20, 30}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("sum of all the elements in array : " + sum);


        System.out.println("\nFind the largest element in a 2D array.");
//        arr = new int[][]{
//                {11, 12, 33},
//                {4, 5, 6},
//                {50, 20, 30}
//        };

        int largest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (largest < arr[i][j]) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest number i : " + largest);

        System.out.println("\nFind the smallest element in a 2D array.");
        arr = new int[][]{
                {1, 12, 33},
                {4, 5, 6},
                {50, 20, 30}
        };
        int smallest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Smallest element in array : " + smallest);

        System.out.println("\nFind the sum of each row.");
        int rowSum = 0;
//        arr = new int[][]{
//                {1, 12, 33},
//                {4, 5, 6},
//                {50, 20, 30}
//        };

        for (int i = 0; i < arr.length; i++) {
            System.out.print("For row : " + i + " sum is : ");
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.print(rowSum);
            System.out.println();
        }


        System.out.println("\nFind the sum of each column.");
        //        arr = new int[][]{
//                {1, 12, 33},
//                {4, 5, 6},
//                {50, 20, 30}
//        };
        int sumCol = 0;
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print("For column : " + i + " sum is : ");
            for (int j = 0; j < arr.length; j++) {
                sumCol += arr[j][i];
            }
            System.out.print(sumCol);
            System.out.println();
        }

        System.out.println("\nCount how many even and odd numbers are present.");
        //        arr = new int[][]{
//                {1, 12, 33},
//                {4, 5, 6},
//                {50, 20, 30}
//        };
        int evenCnt = 0;
        int oddCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr[i][j] % 2) == 0) {
                    evenCnt++;
                } else {
                    oddCnt++;
                }
            }
        }
        System.out.println("Count of even numbers : " + evenCnt);
        System.out.println("Count of odd numbers : " + oddCnt);

        System.out.println("\nPrint the transpose of a matrix.");
        //rows turn to columns and vise versa
        arr = new int[][]{
                {1, 12, 33},
                {4, 5, 6},
                {50, 20, 30}
        };
        System.out.println("Transpose of given matrix : ");
        for(int i=0; i<arr[0].length; i++)
        {
            System.out.print("{ ");
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
        System.out.println("For jagged matrix : ");
        arr = new int[][]{
                {1, 12, 33,  7},
                {4,  5,  6},
                {50, 20, 30},
                {9},
                {0,  1,  2,   3,  4,  5}
        };
        int maxCol = arr.length;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].length>maxCol)
            {
                maxCol=arr[i].length;
            }
        }
        System.out.println("Transpose of given jagged matrix : ");
        for(int i=0; i<maxCol; i++)
        {
            System.out.print("{ ");
            for(int j=0;j<arr.length;j++)
            {
                if(i<arr[j].length)
                {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.print("}");
            System.out.println();
        }

        System.out.println("\nCheck whether a matrix is a square matrix.");
        arr = new int[][]{
                {1, 12, 33, 7},
                {4, 5, 6},
                {50, 20, 30},
                {9},
                {0, 1, 2, 3, 4, 5}
        };
        int rowLength = arr.length;
        int colLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (colLength < arr[i].length) {
                colLength = arr[i].length;
            }
        }
        System.out.println("Row length : " + rowLength);
        System.out.println("Column length : " + colLength);

        if (rowLength == colLength) {
            System.out.println("Given matrix is a square matrix");
        } else {
            System.out.println("Given matrix is not a square matrix");
        }

        System.out.println("\nPrint only diagonal elements.");
        arr = new int[][]{
                {1, 12, 33},
                {4,  5,   6},
                {50, 20, 30}
        };
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j] + " ");
                }
                if (i!=j) {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nFind the sum of diagonal elements.");
//        arr = new int[][]{
//                {1, 12, 33},
//                {4,  5,   6},
//                {50, 20, 30}
//        };

        int add= 0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j)
                {
                    add+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements is : " + add);

        System.out.println("\nReplace all negative numbers with 0.");
        System.out.println("Original matrix : ");
        arr = new int[][]{
                {1, -12, 33},
                {4, -5, -6},
                {-50, 20, 30}
        };
        for (int[] i : arr) {
            System.out.print("{ ");
            for (int value : i) {
                System.out.print(value + " ");
            }
            System.out.print("}");
            System.out.println();
        }
        System.out.println("After replacing -ve with 0 matrix : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
