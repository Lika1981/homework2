package Homework.homework2;

public class WalkDemo {

    public static void main(String[] args) {
        WalkDemo walk = new WalkDemo();

        boolean canWalk;
        boolean isContinue = true;

        while (isContinue);{

            System.out.printf("Can I walk? ... : %b\n-----------------------------------\n");

            isContinue = !Homework.homework2.InputMethods.getBooleanValue(Homework.homework2.InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
        }
    }
}



