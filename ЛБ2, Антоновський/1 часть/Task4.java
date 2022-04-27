package com.company;

import java.util.Arrays;

public class Task4 {
    public static void task4() {
        int[] arr = new int[10];
        int[] even = new int[5];
        int[] uneven = new int[5];
        int min = 0, j = 0, i, sum = 0;
        for (i = 0; i<arr.length; i++) {
            arr[i] = (int) ((Math.random() * (-20)) + 20);
        }
        for (i = 0; i<arr.length; i++) {
            if (Math.abs(arr[i])<Math.abs(arr[min])) min=i;
        }
        for (i = 0; i<arr.length; i++) {
            if (arr[i] == 0) { j=i; break;}
        }
        for (; j<arr.length; j++) {
            sum += arr[j];
        }
        System.out.println("\nМасив випадкових чисел: "+Arrays.toString(arr));
        System.out.println("Минимальний елемент по модулю: " + arr[min] + ", индекс: "+min);
        System.out.println("Сума модулей після першого нуля: "+sum);
        j = 0;
        for (i = 0; i<arr.length; i++) {
            if (i%2==0) {
                even[j] = arr[i];
                j++;
            }
        }
        j = 0;
        for (i = 0; i<arr.length; i++) {
            if (i%2!=0) {
                uneven[j] = arr[i];
                j++;
            }
        }
        j = 0;
        for (i = 0; i< arr.length; i++) {
            if (i<even.length) {
                arr[i]=even[i];
            } else {
                arr[i]=uneven[j];
                j++;
            }
        }
        System.out.println("Преобразований масив чисел: " + Arrays.toString(arr));
    }
}
