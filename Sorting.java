package algorithms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {55,33,66,11,88,34};
        bubbleSort(arr);
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
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        // insert a number to its correct position in sorted array.
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > curr ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

}
