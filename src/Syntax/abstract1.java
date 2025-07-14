package Syntax;

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawwing Circle inside circle ");
    }
}

interface Vehicle{
    void drive();
}
class car implements Vehicle{
    public void drive(){
        System.out.println("Car is driving");
    }
}

public class abstract1 {

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        Vehicle v = new car();
        v.drive();
    }


}
