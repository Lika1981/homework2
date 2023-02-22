package Homework.Homework3;

public class ArrayUtil {
    public static int[] createArray(int arrayLength){
        return new int[arrayLength];


    }

    public static void fillArrayWithRandomNumbers(int[] ourWorkingArray, int i, int i1) {

    }

    public static void printArrayInRow(int[] ourWorkingArray) {
        for (int i = 0; i < ourWorkingArray.length; i++) {
            System.out.printf("%02d", ourWorkingArray[i]);

            System.out.println();

        }
    }

    public static void replaceOddToZero(int[] ourWorkingArray) {
        for (int i = 0; i < ourWorkingArray.length; i++){
            if (i % 2==0){
                ourWorkingArray[i] = 0;

            }
        }
    }

    public static boolean checkIncreasingArray(int[] ourWorkingArray) {
        return false;
    }

    {
    }
}
