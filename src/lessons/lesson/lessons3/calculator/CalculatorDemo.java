package lessons.lessons3.calculator;

public class CalculatorDemo {
    public static void main(String[] args){
        CalcultorOperations calcultorOperations = new CalcultorOperations();

        int a = 5;
        int b = 10;

        int resultOfSum = calcultorOperations.sum(a,b);

        System.out.println(resultOfSum);

        int result2 = calcultorOperations.sum(10, 25);

        System.out.println(result2);

        int resultOfSubstruction = calcultorOperations.minus (55,15);
        int resultOfSubstraction2 = calcultorOperations.minus (b,a);
        System.out.println(resultOfSubstruction);
        System.out.println(resultOfSubstraction2);

        int resultOfMultiplication = calcultorOperations.multiplication(a,b);
        System.out.println(resultOfMultiplication);

        double resultOfDiv = calcultorOperations.div(a,b);
        System.out.println(resultOfDiv);

        double double1 = 5.3;
        float float1 = 5.3f;
        int int1 = 5;


        System.out.println(calcultorOperations.divDoubleParameters(5.2,1.5));
        System.out.println(calcultorOperations.divDoubleParameters(5,2));




    }
}
