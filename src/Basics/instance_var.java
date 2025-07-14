package Basics;

//instance variable and uses
public class instance_var {
    public String geek;
    public int i;
    public Integer I;

    public instance_var(){  // constructor
        this.geek ="abhigyan sinha ";
    }

    public static void main(String[] args) {
        // object creation
        instance_var name = new instance_var();

        System.out.println("geek name is: "+ name.geek);
        System.out.println("default value for int is "+ name.i);

        System.out.println("default value for Integer is :" +  name.I);
    }

}
