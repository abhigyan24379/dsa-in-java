package Syntax;


//Run time polymorphism
class Animal {
    void sound(){
        System.out.println("Animal makes sound");

    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");


    }
}

//Compile time polymorphism
class Calculator {
    int add (int a , int b ){
        return a + b;
    }
    double add (double a , double b ){
        return a+b ;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();

        Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.5,3.1));

    }
}
