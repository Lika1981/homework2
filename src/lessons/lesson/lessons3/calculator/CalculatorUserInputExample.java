package lessons.lesson.lessons3.calculator;

public class CalculatorUserInputExample {
    public static void main(String[] args){
        UserInput userInput = new UserInput();
        CalcultorOperations calcultorOperations = new CalcultorOperations();

        System.out.println("Please enter first integer number -");
        int x = userInput.userInputInteger();
        System.out.println("Please enter second integer number - ");
        int y = userInput.userInputInteger();
        int sumOfNumbers = calcultorOperations.sum(x,y);
        System.out.println("Sum of number is " + sumOfNumbers);

        System.out.println("Please enter first double number - ");
        double xDouble = userInput.userInputDouble();
        System.out.println("Please enter second double number -");
        double yDouble = userInput.userInputDouble();
        double divOfNumbersDouble = calcultorOperations.divDoubleParameters(xDouble, yDouble);
        System.out.println("Result of division of numbers is " + divOfNumbersDouble);




    }
}
