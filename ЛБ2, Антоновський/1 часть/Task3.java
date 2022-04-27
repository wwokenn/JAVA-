package com.company;

import java.util.Arrays;

public class Task3 {
    public static void task3() {
        int sum = 0, prod = 1;
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = (int) ((Math.random() * (-10 - 10)) + 10);
        }
        int min = arr[0],max = arr[0], indexMin = 0, indexMax = 0;
        for (int i = 0; i<arr.length; i++) {
            if (min>arr[i]) { min = arr[i]; indexMin = i; }
            if (max<arr[i]) { max = arr[i]; indexMax = i; }
        }
        if (indexMin>indexMax) {
            for (int i = indexMax; i<=indexMin; i++) {
                if (arr[i]<0) sum += arr[i];
                prod *= arr[i];
            }
        } else if (indexMin<indexMax) {
            for (int i = indexMin; i<=indexMax; i++) {
                if (arr[i]<0) sum += arr[i];
                prod *= arr[i];
            }
        }
        System.out.println("\nМасив випадкових чисел: " + Arrays.toString(arr));
        System.out.println("Сума негативних елементів масиву від min до max: " + sum);
        System.out.println("Показ елементів масива від min до max: " + prod);
        System.out.println("Min: " + min + "; Max: " + max + "; | IndexMin: "+ indexMin + "; IndexMax: " + indexMax + ";");
        Arrays.sort(arr);
        System.out.println("Сортування масиву за зростанням: " + Arrays.toString(arr));
    }
}
