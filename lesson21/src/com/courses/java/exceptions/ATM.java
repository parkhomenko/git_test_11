package com.courses.java.exceptions;

public class ATM implements AutoCloseable {

    int totalMoney;

    public ATM() {
        totalMoney = 100;
    }

    public void getMoney(int money) throws InsufficientMoneyException {
        if (money > totalMoney) {
            throw new InsufficientMoneyException("No money");
        }

        System.out.println("User got " + money);
        totalMoney = totalMoney - money;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Total money: " + totalMoney);
    }
}
