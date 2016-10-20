package com.java.courses.injection;

import java.math.BigDecimal;

public class OrderService {

    private AbstractService emailService;

    public OrderService(AbstractService emailService) {
        this.emailService = emailService;
    }

    public BigDecimal proceedWithOrder(Cart cart) {
        BigDecimal price = cart.getProduct().getPrice();
        int quantity = cart.getQuantity();

        BigDecimal sum = price.add(new BigDecimal(quantity));

        emailService.sendEmail(sum);

        return sum;
    }
}
