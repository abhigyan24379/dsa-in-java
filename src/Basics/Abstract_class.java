package Basics;// an instance of an abstract class cannot be declared
// constructors of abstract class is allowed
// we can have an abstract class without any abstract method
// there can be abstract methods in an abstract class but no abstract method can be final method
// we can define static method in an abstract class
// if any class contains any abstract method i must be initialized by the keyword abstract class

abstract class Sun_star{
    abstract void printInfo();
    Sun_star(){
        System.out.println("adding two number that is 54 and 988"+  (54+98));
    }
}

class Employee extends Sun_star{
    void printInfo(){
        String name = " Avinash";
        int age = 21;
        float salary = 125.6F;
        System.out.println(name );
        System.out.println( age );
        System.out.println( salary);


    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Sun_star s= new Employee();
        s.printInfo();
        //s.Basics.Sun_star();
    }
}
