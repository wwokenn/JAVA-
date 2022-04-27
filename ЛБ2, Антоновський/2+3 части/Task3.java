package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static int[][] initialization(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) ((Math.random() * (-2)) + 2);
            }
        }
        return arr;
    }
    public static void display(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void task3() {
        var sc = new Scanner(System.in);
        System.out.print("\nВведіть розміри матриці N: ");
        int n = sc.nextInt(), m;
        System.out.print("Введіть розміри матриці M: ");
        m = sc.nextInt();
        if (n != m && n >=3 && m>=4) {
            int[][] arr = initialization(n,m);
            display(arr,n);
            int neighbor = 0;
            neighbor = (arr[2][1]==1&&arr[2][3]==1)? (neighbor+2) :
                    (arr[2][1]==1||arr[2][3]==1)? (neighbor+1) : 0;
            System.out.println("\nКількість сусідніх елементів рівних 1 у елемента (2;2): " + neighbor);
        } else {
            System.out.println(n==m?"[Похибка!] Число стрічок та стовбців не повинні бути рівними." :
                    n<3||m<4 ? "[Похибка!] Кількість стрічок масиву не повинно бути меньше 3, а стовбців не меньше 4.":0);
        }
    }
}