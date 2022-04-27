package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void task2() {
        var sc = new Scanner(System.in);
        System.out.print("\nВведіть розміри квадратної матриці N: ");
        int n = sc.nextInt(), prod=1;
        int[][] arr = new int[n][n];
        System.out.println("Матриця випадкових чисел: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) ((Math.random() * (-5 - 10)) + 10);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("Елементи головної діагоналі: ");
        for (int i =0; i < n; i++) {
            if (arr[i][i]>0) { prod *= arr[i][i]; }
            System.out.print(arr[i][i]+" ");
        }
        System.out.println("\nПоказ похитивних елементів діагоналі: " + prod);
    }
}