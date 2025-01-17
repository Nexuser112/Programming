package lab2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("Число делится на 3.");
        } else {
            System.out.println("Число не делится на 3.");
        }

        scanner.close();
    }
}
