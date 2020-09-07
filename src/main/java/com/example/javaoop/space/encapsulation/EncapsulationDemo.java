package com.example.javaoop.space.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Person mike = new Person(42, "Mike", Gender.MALE);
        mike.setName("John");
        System.out.println(mike.getName());

    }
}
