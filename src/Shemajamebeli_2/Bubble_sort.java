package Shemajamebeli_2;

public class Bubble_sort {
    public static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[i] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {7,5,4,2};


        bubblesort(arr);
        for(int num: arr) {
            System.out.println(num);

        }
    }
}