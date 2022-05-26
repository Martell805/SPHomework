public class TaskArrays1 {
    TaskArrays1(){
        // Задание 1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        char[] arr3 = {'h', 'e', 'l', 'l', 'o'};

        // Задание 2

        for(int q = 0; q < arr1.length; System.out.print(arr1[q] + ((q++ == arr1.length - 1) ? "\n" : ", ")));
        for(int q = 0; q < arr2.length; System.out.print(arr2[q] + ((q++ == arr2.length - 1) ? "\n" : ", ")));
        for(int q = 0; q < arr3.length; System.out.print(arr3[q] + ((q++ == arr3.length - 1) ? "\n" : ", ")));

        // Задание 3

        for(int q = arr1.length - 1; q >= 0; System.out.print(arr1[q] + ((q-- == 0) ? "\n" : ", ")));
        for(int q = arr2.length - 1; q >= 0; System.out.print(arr2[q] + ((q-- == 0) ? "\n" : ", ")));
        for(int q = arr3.length - 1; q >= 0; System.out.print(arr3[q] + ((q-- == 0) ? "\n" : ", ")));

        // Задание 4
        for(int q = 0; q < arr1.length; q = ((arr1[q] % 2 == 0) ? arr1[q]++ : arr1[q]) * 0 + q + 1);
        for(int q = 0; q < arr1.length; System.out.print(arr1[q] + ((q++ == arr1.length - 1) ? "\n" : ", ")));
    }
}
