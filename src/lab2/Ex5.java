package lab2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        String numberAsString = String.valueOf(number);

        int thousandsTotal = number / 1000;
        char thousandsFourthChar = numberAsString.charAt(numberAsString.length() - 4);

        System.out.println("Всего тысяч во введенном числе: " + thousandsTotal);
        System.out.println("Четвертая цифра справа в десятичном представлении числа: " + thousandsFourthChar);

        scanner.close();
    }
}
