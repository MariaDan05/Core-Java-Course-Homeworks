public class HomeworkLesson3 {
    public static void main(String[] args) {
        //1
        System.out.println("Task 1: Create an array and fill it with 2 number.");
        int[] arr = {2, 2, 2, 2, 2, 2, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //2
        System.out.println("\nTask 2: Create an array and fill it with numbers from 1:1000.");
        int[] myArray = new int[1000];
        for(int i = 0; i < myArray.length; ++i) {
            myArray[i] = i + 1;
        }

        for(int i = 0; i < myArray.length; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        //3
        System.out.println("\nTask 3: Create an array and fill it with odd numbers from -20:20");
        int[] myArray1 = new int[40];

        for(int i = 0, j = -19; i < 20; ++i, j += 2) {
            myArray1[i] = j;
        }

        for(int i = 0; i < 20; ++i) {
            System.out.print(myArray1[i] + " ");
        }
        System.out.println();

        //4
        System.out.println("\nTask 4: Create an array and fill it. Print all elements which can be divided by 5.");
        int[] arr1 = new int[100];
        int x = 0;
        while(x < arr1.length){
            arr1[x] = x + 1;
            ++x;
        }

        x = 0;
        while(x < arr1.length) {
            if (arr1[x] % 5 == 0) {
                System.out.print(arr1[x] + " ");
            }
            ++x;
        }
        System.out.println();

        //5
        System.out.println("\nTask 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        int i1 = 0;
        double[] arr2 = new double[500];
        for(double d = 24.12; d < arr2.length; d+=1.11, ++i1) {
            arr2[i1] = d;
        }

        for(int i = 0; i < arr2.length; ++i) {
            if(arr2[i] >= 24.12 && arr2[i] <= 467.23) {
                System.out.println(arr2[i]);
            }
        }

        //6
        System.out.println("\nTask 6: Create an array and fill it(1 - 150). Print count of elements which can be divided by 2.");
        int[] arr3 = new int[150];
        for(int i = 0; i < arr3.length; ++i) {
            arr3[i] = i + 1;
        }

        int count = 0;
        for(int i = 0; i < arr3.length; i += 2) {
            ++count;
        }
        System.out.print(count);
        System.out.println();

        //7
        System.out.println("\nTask 7: Given an integer, 0< N < 21, print its first 10 multiples.");
        int N = 8;
        System.out.println("The result is: ");
        for(int i = 1; i < 11; ++i)
        {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        //8
        System.out.println("\nTask 8: Create an array and fill it. Find number with no pair in array:");
        int[] array = {3, 2, 4, 5, 5, 4, 2, 6, 7, 6, 7, 8, 11, 11, 8};
        int ans = array[0];
        for (int i = 1; i < array.length; i++) {
            ans ^= array[i];
        }
        System.out.println(ans);
    }
}
