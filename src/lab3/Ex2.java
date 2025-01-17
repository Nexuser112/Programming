package lab3;

import java.util.Scanner;

public class Ex2 {
    private static final String DAY_MESSAGE = "Порядковый номер дня: ";
    private static final String NO_SUCH_DAY_MESSAGE = "Такого дня нет.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Каким способом определить порядковый номер дня?");
        System.out.println("1 - Вложенными условиями");
        System.out.println("2 - С помощью оператора switch");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        System.out.print("Введите день недели: ");
        String day = scanner.next().toLowerCase();

        switch(choice) {
            case 1:
                findDayOfWeekWithIf(day);
                break;
            case 2:
                findDayOfWeekWithSwitch(day);
                break;
            default:
                System.out.println("Неправильный ввод. Попробуйте снова.");
                break;
        }

        scanner.close();
    }

    // Определение дня через вложенные условия
    private static void findDayOfWeekWithIf(String day) {
        if ("понедельник".equals(day)) {
            System.out.println(DAY_MESSAGE + "1");
        } else if ("вторник".equals(day)) {
            System.out.println(DAY_MESSAGE + "2");
        } else if ("среда".equals(day)) {
            System.out.println(DAY_MESSAGE + "3");
        } else if ("четверг".equals(day)) {
            System.out.println(DAY_MESSAGE + "4");
        } else if ("пятница".equals(day)) {
            System.out.println(DAY_MESSAGE + "5");
        } else if ("суббота".equals(day)) {
            System.out.println(DAY_MESSAGE + "6");
        } else if ("воскресенье".equals(day)) {
            System.out.println(DAY_MESSAGE + "7");
        } else {
            System.out.println(NO_SUCH_DAY_MESSAGE);
        }
    }

    // Определение дня через оператор switch
    private static void findDayOfWeekWithSwitch(String day) {
        switch (day) {
            case "понедельник":
                System.out.println(DAY_MESSAGE + "1");
                break;
            case "вторник":
                System.out.println(DAY_MESSAGE + "2");
                break;
            case "среда":
                System.out.println(DAY_MESSAGE + "3");
                break;
            case "четверг":
                System.out.println(DAY_MESSAGE + "4");
                break;
            case "пятница":
                System.out.println(DAY_MESSAGE + "5");
                break;
            case "суббота":
                System.out.println(DAY_MESSAGE + "6");
                break;
            case "воскресенье":
                System.out.println(DAY_MESSAGE + "7");
                break;
            default:
                System.out.println(NO_SUCH_DAY_MESSAGE);
                break;
        }
    }
}