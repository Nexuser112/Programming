package lab1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите номер дня в месяце: ");
        int date = scanner.nextInt();

        System.out.printf("Сегодня: " + dayOfWeek + " " + date + " " + month);

        scanner.close();
    }
}
