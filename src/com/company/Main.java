package com.company;

public class Main {
    public static final String CliENTID = "1987192KJSHDAKSDHKAJ";

    public static int multiplier = 3;
    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        CliENTID = "Asdadsa";


    }
    public static int multipy(int number){
        StaticTest staticTest = new StaticTest("1");
        staticTest.getName();
        divide();
        return number * multiplier;

    }

    public static void divide(){
        return;
    }
}
