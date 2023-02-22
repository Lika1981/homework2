package Homework.Homework3;

import lessons.lesson.lessons3.calculator.UserInputIterface;

public class ArrayDemo1 {
    // Создайте массив из 8 случайных целых чисел из интервала [1;50]
    //     Выведите массив на экран в строку
    //     Замените каждый элемент с нечётным индексом на ноль
    //     Снова выведете массив на экран на отдельной строке

    public static void main(String[] args){
        int arraySize = UserInputIterface.userArraySizeInput("Please enter array size:");
        int[] ourWorkingArray = ArrayUtil.createArray(arraySize);

        ArrayUtil.fillArrayWithRandomNumbers(ourWorkingArray, 1,50);
        ArrayUtil.printArrayInRow(ourWorkingArray);
        ArrayUtil.replaceOddToZero(ourWorkingArray);
        ArrayUtil.printArrayInRow(ourWorkingArray);


    }
}
