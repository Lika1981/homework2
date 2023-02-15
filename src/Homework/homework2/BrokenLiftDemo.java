package Homework.homework2;

public class BrokenLiftDemo {
    public static void main(String[] args) {


        int numberOfLifts;

        boolean isContinue = true;

        while (isContinue){


            isContinue = !Homework.homework2.InputMethods.getBooleanValue(Homework.homework2.InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
        }
    }
}
