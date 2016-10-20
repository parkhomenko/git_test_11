package com.java.courses.injection;

import java.math.BigDecimal;

public class EmailService implements AbstractService {

    public boolean sendEmail(BigDecimal sum) {
        System.out.println("Some external operation");
        System.out.println(sum);
        return true;
    }

}
