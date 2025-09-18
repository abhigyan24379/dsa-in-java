package Recursion;

public class BinaryString {
    public static void printBinStrng(int n , int lastPlace, String str){
//        if(lastPlace == 0){
//            printBinStrng(n-1, 0, str.append("0"));
//            printBinStrng(n-1,0, str.append("1"));
//        }
//        else{
//            printBinStrng(n-1, 1, str.append("0"));
//        }
        if(n == 0){
            System.out.println(str);
            return ;
        }


        printBinStrng(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrng(n-1, 1, str+"1");
        }


    }

    public static void main(String[] args) {
        printBinStrng(3, 0, "");
    }
}
