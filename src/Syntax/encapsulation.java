package Syntax;

public class encapsulation {
    public static void main(String[] args) {
        person p = new person("Alice", 22);
        System.out.println(p.getName());
        p.SetName("Bob");
        System.out.println(p.getName());
    }


}
class person {
    private String name ;
    private int age ;

    // constructor
    public person(String name, int age  ){
        this.name = name ;
        this.age = age ;

    }

    // Getter
    public String getName(){
        return name ;
    }
    public void SetName (String name){
        this.name = name;
    }
}
