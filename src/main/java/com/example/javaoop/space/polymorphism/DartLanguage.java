package com.example.javaoop.space.polymorphism;

public class DartLanguage implements ProgrammingLanguage{
    @Override
    public String compile() {
        return "Compiling to native system code... Or JavaScript.";
    }

    @Override
    public String run() {
        return "Running a dart program.. We are prob. createing a flutter app";
    }
}
