1 задание
package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,n;
        for (;;) {
            x = sc.nextDouble(); /* Вводиться данні "x". */
            y = sc.nextDouble(); /* Вводиться данні "y". */
            n = (Math.sqrt((x+2)/(3*y+1))+((8*Math.pow(x,2)+3)/(1-9*Math.pow(y,2)))*((x+0.5)/(9*y+3))); /* Формула варіанту 1 */
            if (!Double.isNaN(n)) { /* визначає чи є літерал або змінна нечисловим значенням isNan чи ні */
                System.out.print("n = "+n);
                break;
            }
            System.out.println("Немає жодних рішень.\n");
        }
    }
}


2 задание
package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(); /* Вводиться координата "x". */
        double y = sc.nextDouble(); /* Вводиться координата "x". */
        if (Math.abs(x)<=1 && Math.abs(y)<=1 && Math.abs(x)+Math.abs(y)>=1) { /* Обчислення точок де x, y <=1 та >=1 */
            System.out.println("Підпадає в заштриховану зону.");
        }
        System.out.println("Не підпадає в заштриховану зону.");
    }
}


3 задание
package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть номер задачі від 1 до 3 : "); /* Вибірка завдань задачі. */
        int num_task = sc.nextInt();
        int x;
        switch (num_task) { /* Перемикач між завданнями. */
            case 1:
                System.out.println("Введіть перше та останнє число : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) { /* "а" не може бути більше "b", тому що виводяться цифри від "а" до "b". */
                    System.out.println("Некоректні дані! ");
                    break;
                }
                System.out.println("Введіть число кратності : ");
                int c = sc.nextInt();
                for(int i = a; i <=b; i++) {
                    if (i%c == 0)
                        System.out.println(i);
                }
                break;
            case 2:
                System.out.println("Введіть число : ");
                int n = sc.nextInt();
                int j = 0;
                int[] mas = new int[200]; /* Масив цілого числа до 200.*/
                int res;
                int zero = 0, one = 0;
                for (int i = n; i!=0; i/=2, j++) {
                    res = i%2;
                    mas[j] = res;
                    if (mas[j] == 0)
                        zero++;
                    else if (mas[j] == 1)
                        one++;
                }
                System.out.println("Кількість нулей --- "+ zero);
                System.out.println("Кількість единиц --- "+ one);
                break;
            case 3:
                long pow = 1, sum = 0;
                for (int i = 1; i <= 9; i++) {
                    for (int k = 0; k <= i; k++) {
                        sum+=k;
                    }
                    pow*=sum;

                    System.out.println(sum);
                    sum = 0;
                }
                System.out.println(pow); //3 6 10 15 21 28 36 45
                break;
        }


4 задание
package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double x = 0, i = 1, h = 0.1, y, sum = 0, last = 0;
        while (x <= i + 0.001) {
            y = (9 / (2 * Math.cos(2 * x) - Math.abs(Math.sin(x / 1.1))));
            if (Double.isNaN(y))
                System.out.print("x = " + x + "\t\t-"); /* \t  - значення табуляції */
            else
                System.out.print("x = " + x + "\t\t y = " + y + "\n");
            if (x == 0) sum = y;
            last = y;
            x += h;
        }
        System.out.println("\nСумма = " + (sum += last));
        System.out.print("Количество: " + (i / h) + 1);
    }
}



5 задание
package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in), sc1 = new Scanner(System.in);
        System.out.print("Введіть значення n: ");
        int n = sc.nextInt(), k;
        double a = 0;
        System.out.print(n < 0 ? "Похибка \n " : " ");
        for (k=0; k<=n; k++) {
            a = a !=0 ? a * k + 1 / k : 1;
            System.out.println("a" + k + " = " + a);
        }
    }
}