package lessons2;

public class CarDemo {

    public static void main(String[] args){

        Car mySupersCar = new Car();

        // создали экземпляр класса Car

        mySupersCar.model = "Mercedes G-class";
        mySupersCar.numbersOfWheel = 4;
        mySupersCar.isEletric = false;
        mySupersCar.distance = 25125.5;

       System.out.println("Parameters of my car is:");
       System.out.println("Model - " + mySupersCar.model);
       System.out.println("Number of wheels is - " + mySupersCar.numbersOfWheel);
       System.out.println("My car electric - " + mySupersCar.isEletric);
       System.out.println("Distance is " + mySupersCar.distance);

       Car myFriendCar = new Car();

       /* Создали несколько экземпляров класса
        заполнили поля данными и
        вывели на экран значения переменных экземпляра класса

        */

        myFriendCar.model = "Tesla Type S";
        myFriendCar.numbersOfWheel = 4;
        myFriendCar.isEletric = true;
        myFriendCar.distance = 100.3;

        System.out.println("Parameters of my friends car is:");
        System.out.println("Models - " + myFriendCar.model);
        System.out.println("number of wheels is - " + myFriendCar.isEletric);
        System.out.println("Distance is "+ myFriendCar.distance);





    }
}
