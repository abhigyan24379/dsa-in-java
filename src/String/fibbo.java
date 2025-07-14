package String;

public class fibbo {
    // this is  program for fibbonachi
    /*
    so in fibbonachi series
    011235.....n
    lets start with this code ok

     */
    public static void main(String[] args) {
        int s=0;
        int mid=1;
        int series=0;
        int n = 6;
        while(n >0){
            System.out.println(series);
            series=s+mid;
            s=mid;
            mid= series ;
            n--;
        }

    }

}
