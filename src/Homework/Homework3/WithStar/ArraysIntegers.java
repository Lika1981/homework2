package Homework.Homework3.WithStar;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntegers {
    /* 1. Определить закономерность, согласно которой формируется та или иная числовая последовательность.
    2. Написать функцию, которая формирует первые N = 10 элементов данной последовательности в виде целочисленного массива и выводит элементы массива на экран.
       1-я последовательность: 2,  4,  6,   8,  10…
       2-я последовательность: 1,  3,  5,   7,   9…
       3-я последовательность: 1,  4,  9,  16,  25…
       4-я последовательность: 1,  8, 27,  64, 125…
       5-я последовательность: 1, -1,  1,  -1,   1,  -1…
       6-я последовательность: 1, -2,  3,  -4,   5,  -6…
       7-я последовательность: 1, -4,  9, -16,  25….
       8-я последовательность: 1,  0,  2,   0,   3,   0,  4….
       9-я последовательность: 1,  2,  6,  24, 120, 720…
       10-я последовательность: 1,  1,  2,   3,   5,   8, 13, 21…

     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfIntegers(10)));


    }

    public static int[] createArrayOfIntegers(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) {
                System.out.print(array[i]);
            }
        }
        return array;
    }
}












