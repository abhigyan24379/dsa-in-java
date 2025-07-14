package Basics;

public class ALL_Array {
    static void traversing(int arr[])
    {
        int n= arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.println("the value of at place "+ i + " is " + arr[i] );
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,8,7,45,65,93,84,12,27};
        //traversing(arr);
    }
}
