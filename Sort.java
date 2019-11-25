package task1;

//import java.util.Scanner;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ARRAY LENGTH: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("ARRAY CAN'T BE LESS THAN 0!!!");
        }
        System.out.print("ENTER "+ n + " Numbers:  ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length<1){
            System.out.println("I NEED SOME NUMBER");
        }
        else if (arr.length==1){
            System.out.println("ARRAY IS SORTED");
        }
        else {
            int s = arr.length ;
            for (int i = 0; i < s; i ++){
                for (int j = i; j>0 && arr[j-1] > arr[j]; j--) {
                    int t = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t;
                }
            }
            for (int i = 0; i < s; i ++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("THERE IS SORTED ARRAY");
        }
    }
}