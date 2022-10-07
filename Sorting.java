package algorithms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {55,33,66,11,88,34};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        // find the minimum number and swap with the starting number.
        for(int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr){

    }

    public static void insertionSort(int[] arr){

    }

}
