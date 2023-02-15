package Homework.homework2;

public class TaskBuyDemo {

    public static void main(String[] args) {


        boolean canBuy;

        boolean isContinue = true;

        while (isContinue){

            isContinue = !Homework.homework2.InputMethods.getBooleanValue(Homework.homework2.InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
        }
    }
}

