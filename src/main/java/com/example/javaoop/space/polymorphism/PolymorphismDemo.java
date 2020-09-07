package com.example.javaoop.space.polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {
        DartLanguage dartLanguage = new DartLanguage();
        System.out.println(dartLanguage.compile());
        System.out.println(dartLanguage.run());

        PythonLanguage pythonLanguage = new PythonLanguage();
        System.out.println(pythonLanguage.run());
        System.out.println(pythonLanguage.compile());

        JavaLanguage javaLanguage = new JavaLanguage();
        System.out.println(javaLanguage.compile());
        System.out.println(javaLanguage.run());


    }
}
