package lab1;

import java.time.Year;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите ваш год рождения:");
        int birthYear = scanner.nextInt();

        Year currentYear = Year.now();
        int currentYearInt = currentYear.getValue();

        int ageIfBirthdayHappened = currentYearInt - birthYear;
        int ageIfBirthdayNotHappened = ageIfBirthdayHappened - 1;

        System.out.println("// Если Ваш День Рождения уже прошел");
        System.out.println(name + ", ваш возраст: " + ageIfBirthdayHappened + " лет.");
        System.out.println("// Если Ваш День Рождения еще не  прошел");
        System.out.println(name + ", ваш возраст: " + ageIfBirthdayNotHappened + " лет.");

        scanner.close();
    }
}
