package String;

public class builder {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello");
        str.append("world"); // we can append int char string and etc
        System.out.println(str);
        str.setCharAt(3,'h'); // used to replce the char
        System.out.println(str);
        str.insert(6,'g');
        System.out.println(str);
        str.deleteCharAt(6);
        System.out.println(str);
    }
}
