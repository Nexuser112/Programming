package lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int minNumber = Math.min(firstNumber, secondNumber);
        int maxNumber = Math.max(firstNumber, secondNumber);

        System.out.println("\nЦелые числа от " + minNumber + " до " + maxNumber + ":");
        printNumbers(minNumber, maxNumber);

        scanner.close();
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}