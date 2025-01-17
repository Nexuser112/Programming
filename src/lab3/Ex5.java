package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int count = scanner.nextInt();

        ArrayList<Integer> numbers = getNumbers(count);

        System.out.println("Числа: ");
        printNumbersAndSum(numbers);

        scanner.close();
    }

    private static ArrayList<Integer> getNumbers(int count) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int currentCount = 0;
        int number = 0;

        while (currentCount < count) {
            if (number % 5 == 2 || number % 3 == 1) {
                numbers.add(number);
                currentCount++;
            }
            number++;
        }

        return numbers;
    }

    private static void printNumbersAndSum(ArrayList<Integer> list) {
        int sum = 0;

        for (Integer number : list) {
            System.out.print(number + " ");
            sum += number;
        }

        System.out.println();
        System.out.println("Сумма чисел: " + sum);
    }
}