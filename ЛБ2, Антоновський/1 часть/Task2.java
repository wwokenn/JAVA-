package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void task2() {
        var sc = new Scanner(System.in);
        int counter=0;
        System.out.print("Введіть розмір масиву: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = (int) ((Math.random() * (-5)) + 5);
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("\nНайбільша кількість елементів, що знаходяться подряд: ");
        System.out.println(counter);
    }
}
