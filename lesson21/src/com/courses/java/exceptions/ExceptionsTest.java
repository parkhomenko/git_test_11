package com.courses.java.exceptions;

public class ExceptionsTest {
    public static void main(String[] args) {
        ExceptionsTest exceptionsTest = new ExceptionsTest();
        int errorCode = exceptionsTest.readFileFromServer();

        if (errorCode == 0) {
            // функция выполнена успешно
        } else {
            if (errorCode == -1) {
                System.out.println("Соединение недоступно");
            }

            if (errorCode == -2) {
                System.out.println("Файл не существует");
            }
        }
    }

    public int readFileFromServer() {

        //пропало соединение с сетью
        if (networkRequest()) {
            return -1;
        }

        //проверка существования файла
        if (!isFileExists()) {
            return -2;
        }

        //логика по чтению файла

        return 0; //всё прошло хорошо
    }

    public boolean networkRequest() {
        return false;
    }

    public boolean isFileExists() {
        return false;
    }
}
