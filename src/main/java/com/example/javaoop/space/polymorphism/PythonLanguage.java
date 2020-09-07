package com.example.javaoop.space.polymorphism;

public class PythonLanguage implements ProgrammingLanguage{
    @Override
    public String compile() {
        throw new RuntimeException("Does not compile! Just run the source file!");
    }

    @Override
    public String run() {
        return "swoooosh this is fun";
    }
}
