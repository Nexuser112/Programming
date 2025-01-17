package lab3;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        int bound = 100;

        fillArrayWithRandomNumbers(array, bound);

        System.out.println("Массив:");
        printArray(array);
        System.out.println();

        array = sortArrayByDescending(array);

        System.out.println("Массив после сортировки в порядке убывания:");
        printArray(array);
        System.out.println();
    }

    private static void fillArrayWithRandomNumbers(int[] array, int bound) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static int[] sortArrayByDescending(int[] array) {
        Arrays.sort(array);
        reverseArray(array);
        return array;
    }

    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}