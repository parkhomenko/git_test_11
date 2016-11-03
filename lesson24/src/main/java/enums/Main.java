package enums;

public class Main {

    public static void main(String[] args) {

        int type = Fruit.APPLE_GREEN;
        int wrongType = 5;

        Apple apple = Apple.GREEN;
        Orange orange = Orange.RED;

        //Apple wrong = 5;

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.someAction();
    }
}
