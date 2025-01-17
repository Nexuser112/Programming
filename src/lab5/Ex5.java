package lab5;

public class Ex5 {
    public static class ClassExample5 {
        // Закрытое целочисленное поле
        private int number;

        // Конструктор без аргументов
        public ClassExample5() {
            this.number = 0;
        }

        // Конструктор с аргументом
        public ClassExample5(int number) {
            setNumber(number);
        }

        // Метод для присвоения значения полю без аргументов (обнуляет поле)
        public void setNumber() {
            this.number = 0;
        }

        // Метод для присвоения значения полю с аргументом
        public void setNumber(int number) {
            this.number = Math.min(number, 100);
        }

        // Метод для проверки значения поля
        public void printNumber() {
            System.out.println("Текущее значение поля number = " + number);
        }
    }

    public static void main(String[] args) {
        ClassExample5 obj1 = new ClassExample5();
        obj1.printNumber();

        obj1.setNumber();
        obj1.printNumber();

        obj1.setNumber(100);
        obj1.printNumber();

        obj1.setNumber(101);
        obj1.printNumber();

        ClassExample5 obj2 = new ClassExample5(150);
        obj2.printNumber();

        obj2.setNumber(99);
        obj2.printNumber();

        obj2.setNumber(100);
        obj2.printNumber();

        obj2.setNumber(101);
        obj2.printNumber();
    }
}
