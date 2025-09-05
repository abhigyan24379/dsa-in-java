package Recursion;
// Amazon m aaya tha bhai
public class Tiling {
       public static int tiling(int n ){
           if( n ==0 || n==1){
               return 1;
           }
           int verticalTiles = tiling(n-1);
           int horizontalTiles = tiling(n-2);

           int total = verticalTiles + horizontalTiles;
           return total;
       }

    public static void main(String[] args) {
           System.out.println(tiling(4));
    }
}
