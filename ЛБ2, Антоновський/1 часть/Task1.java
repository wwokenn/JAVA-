package com.company;

import java.util.Arrays;

public class Task1 {
    public static void task1() {
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = (int) ((Math.random() * (-10 - 10)) + 10);
        }
        System.out.println("\nМасив випадкових чисел: "+Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
        System.out.println("Преобразований масив чисел: "+Arrays.toString(arr));

    }
}
