package com.example.javaoop.space.polymorphism;

public class JavaLanguage implements ProgrammingLanguage {

    //    Runtime polymorphism
    @Override
    public String compile() {
        return "Tjikka tjikka baah hbaaah";
    }

    //    Compiletime polymorphism
    public String compile(String version) {
        return "This is complient with version " + version;
    }

    @Override
    public String run() {
        return "Yay im running Java....";
    }
}
