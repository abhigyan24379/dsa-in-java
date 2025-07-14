package String;
class Box{
    double width;
    double height;
    double depth;
    Box(double w, double h , double d){
        width = w;
        height = h;
        depth = d;
    }
    public  String toString(){
        return "dimensions are "+ width + " by "+ depth + " by "+ height+ " .";
    }

}
public class stringPractice {
    public static void main(String[] args) {
//        String str = "9";
//        String s= "he is "+ str +" years old.";
//        System.out.println(s);

//        Box b= new Box(10,20,40);
//        String s = "Box b: "+ b;
//        System.out.println(b);
//        System.out.println(s);
        String S = "this is a demo of getChars method";
        int Start =10;
        int end =14;
        char Buf[] = new char[end - Start];
        S.getChars(Start , end , Buf, 0);
        System.out.println(Buf);
        byte [] ab = S.getBytes();
        for (byte b : ab) {
            System.out.print(b + " ");
        }



    }
}
