package com.company;

public class SubClass extends TestClass {


    public void displayInformation(){
        System.out.println("I am in the subclass");
    }

    public void connectingPage(){
        System.out.println("I am in the subclass");
    }

    public void myNewMethod() {
        SubClass newSubClass = new SubClass();
        newSubClass.displayInformation();

        super.displayInformation();

}


}
