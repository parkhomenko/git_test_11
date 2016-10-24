package com.courses.java.exceptions;

public class Person {
    public static void main(String[] args) {

        try (ATM atm = new ATM()) {
            atm.getMoney(50);
            atm.getMoney(10);
            atm.getMoney(10);
        } catch (InsufficientMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
