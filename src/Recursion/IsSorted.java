package Recursion;

public class IsSorted {
    public static boolean isSorted(int arr[] , int i){
        if( i == arr.length -1 ){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurance (int arr[] , int key , int i ){
        if(arr.length == i){
            return -1;
        }
        if(arr[i] ==key){
            return i;
        }
        return firstOccurance(arr, key, i +1);
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int arr1[] = {1,2,3,4,5,6,9,8};

        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr1, 0));
        System.out.println(firstOccurance(arr, 5, 0));
    }
}
