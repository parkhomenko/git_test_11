package com.java.courses.injection;

import java.math.BigDecimal;

public class FloatingTest {
    public static void main(String[] args) {
        double price = 35.56;
        //price = price + 3.8;
        price = price / 3;

        System.out.println(price);

        BigDecimal number = new BigDecimal(35.56);
        number.setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal devisor = new BigDecimal(3.0);
        devisor.setScale(2, BigDecimal.ROUND_HALF_UP);

        number = number.divide(devisor, BigDecimal.ROUND_HALF_UP);

        System.out.println(number);
    }
}
