package lab4;

public class Ex1 {
    public static void main(String[] args) {
        int figure = 10;  // Число строк которое необходимо вывести
        int i;            // Переменная задает число, необходимое для расчета количества строк
        int j;            // Переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z;            // Переменная необходима для вывода служебного сообщения о количестве символов в строке;

        for (i = 1; i <= figure; i++) {
            System.out.print("Номер строки: " + i + " ");
            z = 0;
            for (j = -5; j < figure; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}
