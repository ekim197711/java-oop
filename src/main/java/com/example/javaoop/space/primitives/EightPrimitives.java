package com.example.javaoop.space.primitives;

public class EightPrimitives {
    public static void main(String[] args) {
        System.out.println("BEGIN");
        boolean myboolean = false;
        byte mybyte = Byte.parseByte("s");
        char mychar = 'm';
        int myint = 1;
        float myfloat = 1.2f;
        double mydouble = 1.3;
        long mylong = 0;
        short myshort = 0;
        System.out.println("END");
    }

    public static void autoboxing(){
        boolean myboolean = false;
        byte mybyte = Byte.parseByte("s");
        char mychar = 'm';
        int myint = 1;
        float myfloat = 1.2f;
        double mydouble = 1.3;
        long mylong = 0;
        short myshort = 0;

        Boolean mybooleanObject = myboolean;
        Byte mybyteObject = mybyte;
        Character mycharObject = mychar;
        Integer myintObject = myint;
        Float myfloatObject = myfloat;
        Double mydoubleObject = mydouble;
        Long mylongObject = mylong;
        Short myshortObject = myshort;

    }

    public static void unboxing(){
        Boolean mybooleanObject = Boolean.valueOf(true);
        Byte mybyteObject = Byte.parseByte("M");
        Character mycharObject = 'c';
        Integer myintObject = 0;
        Float myfloatObject = 0.0f;
        Double mydoubleObject = 0.0;
        Long mylongObject = 0L;
        Short myshortObject = 0;

        boolean myboolean = mybooleanObject;
        byte mybyte = mybyteObject;
        char mychar = mycharObject;
        int myint = myintObject;
        float myfloat = myfloatObject;
        double mydouble = mydoubleObject;
        long mylong = mylongObject;
        short myshort = myshortObject;
    }
}
