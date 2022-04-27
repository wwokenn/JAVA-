package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void task1() {
        var sc = new Scanner(System.in);
        System.out.print("\nВведіть розміри матриці N: ");
        int n = sc.nextInt(), m, index=0;
        System.out.print("Введіть размери матриці M: ");
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Матриця випадковиї чисел: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) ((Math.random() * (-10)) + 10);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < n; i++) {
            int minLine = arr[i][0];
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < minLine) {
                    minLine = arr[i][j];
                    index=j;
                }
            }
            System.out.println("Мінімальне число в стрічці: " + minLine + "\tІндекс: ["+i+"]["+index+"]");
            index = 0;
        }
    }
}