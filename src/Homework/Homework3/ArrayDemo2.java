package Homework.Homework3;

public class ArrayDemo2 {

    //    Создайте массив из 5 случайных целых чисел из интервала [10;99]
    //    Выведите его на экран в строку.
    //    Определите и выведите на экран сообщение о том,
    //    является ли массив строго возрастающей последовательностью. (отредактировано)

    public static void main(String[] args) {
        int arraySize = UserInterface.userArraySizeInput("Please enter array size:");
        int[] ourWorkingArray = ArrayUtil.createArray(arraySize);

        ArrayUtil.fillArrayWithRandomNumbers(ourWorkingArray, 10,99);
        ArrayUtil.printArrayInRow(ourWorkingArray);

        boolean isIncreasingArray = ArrayUtil.checkIncreasingArray(ourWorkingArray);
        if (isIncreasingArray) {
            System.out.println("Array is in a strictly increasing");{

                Object esle;
                }
                System.out.println("Array is not in a strictly increasing");

                }
            }
        }



