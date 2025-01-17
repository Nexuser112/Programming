package lab4;

public class Ex2 {
    public static void main(String[] args) {
        int height = 5; // Высота треугольника

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
