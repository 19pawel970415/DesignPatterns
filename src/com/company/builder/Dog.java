package com.company.builder;

import java.util.List;

public class Dog {

    //Zadanie 5 - builder

    //Stwórz builder dla klasy, która ma następujące pola:

    //public class Dog {

    //  private String name;
    //  private String type;
    //  private Integer age;
    //  private List<String> toys;

    //Builder powinien zostać zdefiniowany wewnątrz klasy Dog i powinien być jedynym sposobem stworzenia jej instancji.


    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog (Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.toys = builder.toys;
    }

    public static class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
