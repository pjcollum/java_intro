package com.company;

class TestClass {

    public void secretInformation(){
       // System.out.println("Random text");
    }
    public void displayInformation() {
        secretInformation();
        System.out.println("This is a parent class");
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here

        //TestClass newTestClass = new TestClass();
        //newTestClass.displayInformation();

        SubClass newSubClass = new SubClass();
        newSubClass.myNewMethod();

        String name = "Pete";
        int age = 27;
        boolean really = true;
        String workPlace = "Code Nation";
        char workingChar = 'C';
        float weightInLbs = 153.9f;
        double weightInKg = 69.9;


        //System.out.println(name);
    }
}
