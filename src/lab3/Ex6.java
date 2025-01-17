package lab3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = getValidSize(scanner);

        int[] array = new int[size];
        fillArray(array);
        printArray(array);

        scanner.close();
    }

    private static int getValidSize(Scanner scanner) {
        while (true) {
            try {
                int size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    return size;
                } else {
                    System.out.println("Размер массива должен быть больше 0. Введите корректное значение:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение. Введите целое число:");
            }
        }
    }

    private static void fillArray(int[] array) {
        int counter = 0;
        int value = 2;

        while (counter < array.length) {
            array[counter++] = value;
            value += 5;
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}