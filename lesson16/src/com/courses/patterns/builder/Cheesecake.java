package com.courses.patterns.builder;

public class Cheesecake {

    private String name;
    private int weight;
    private int fat;
    private int carbohydrate;
    private int protein;
    private String vitamins;

    public static class Builder {
        private String name;
        private int weight;
        private int fat;
        private int carbohydrate;
        private int protein;
        private String vitamins;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder protein(int protein) {
            this.protein = protein;
            return this;
        }

        public Builder vitamins(String vitamins) {
            this.vitamins = vitamins;
            return this;
        }

        public Cheesecake build() {
            return new Cheesecake(this);
        }
    }

    private Cheesecake(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
        this.protein = builder.protein;
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
        this.vitamins = builder.vitamins;
    }
}
