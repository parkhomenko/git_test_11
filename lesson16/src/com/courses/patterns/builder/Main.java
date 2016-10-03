package com.courses.patterns.builder;

public class Main {

    public static void main(String[] args) {

        //Java bean pattern
        CheesecakeBean cheesecakeBean = new CheesecakeBean();
        cheesecakeBean.setName("Double Cheese");
        cheesecakeBean.setWeight(5);
        cheesecakeBean.setFat(3);
        cheesecakeBean.setCarbohydrate(8);
        cheesecakeBean.setProtein(10);
        cheesecakeBean.setVitamins("A, B, E");

        //Telescopic pattern
        CheesecakeTelescopic cheesecakeTelescopic =
                new CheesecakeTelescopic("Double", 5);

        //Cheesecake cheesecake = new Cheesecake(); can't do - constructor is private

        Cheesecake cheesecake =
                new Cheesecake.Builder()
                        .name("Double Cheese")
                        .weight(5)
                        .fat(3)
                        .carbohydrate(8)
                        .protein(10)
                        .vitamins("A, B, E")
                        .build();
    }
}
