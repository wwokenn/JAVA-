import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[200];
        int a = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (-50 - 52)) + 51);
        }
        System.out.println("\nМасив випадкових чисел від -50 до 50\nРозмірність масиву: "+arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.print("\nПарні елементи: ");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                counter++;
                a=arr[i];
                System.out.print(a + " ");
            }
        }
        System.out.println("\nКількість парних елементів масиву: " + counter);
    }
}
