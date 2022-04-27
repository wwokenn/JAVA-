package com.company;

import java.util.Arrays;

public class Task6 {
    public static void task6() {
        int[] arr = new int[10];
        int min = 0, j = 0, i, sum = 0, counter = 0;
        for (i = 0; i<arr.length; i++) {
            arr[i] = (int) ((Math.random() * (-10 - 10)) + 10);
        }
        System.out.println("\nМасив випадкових чисел: "+Arrays.toString(arr));
        for (i = 0; i<arr.length; i++) {
            if (Math.abs(arr[i])<Math.abs(arr[min])) min=i;
        }
        for (i = 0; i<arr.length; i++) {
            if (arr[i] == arr[min]) { j=i; break;}
        }
        for (; j<arr.length; j++) {
            sum += arr[j];
        }
        for (i = 0; i<arr.length; i++) {
            if (arr[i] < 0) {
                counter++;
                arr[i]*=(-arr[i]);
            }
        }
        System.out.println("Кількість негативних елемнтів масиву: " + counter);
        System.out.println("Мінімальний елемент по модулю: " + arr[min] + ", індекс: " + min);
        System.out.println("Сума модулей розташовиних після мінімального елемента по модулю: " + sum);
        System.out.println("\nПреобразований масив чисел: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Сортування за зростанням: " + Arrays.toString(arr));
    }
}
