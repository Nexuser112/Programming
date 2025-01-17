package lab5;

public class Ex4 {
    public static class ClassExample4 {
        public char character;
        public int number;

        public ClassExample4(int number, char character) {
            this.number = number;
            this.character = character;
        }

        public ClassExample4(double value) {
            this.character = (char) ((int) value);
            this.number = (int) ((value * 100) % 100);
        }
    }

    public static void main(String[] args) {
        ClassExample4 obj1 = new ClassExample4(65.1267);
        System.out.println("obj1: character = " + obj1.character + ", number = " + obj1.number);

        ClassExample4 obj2 = new ClassExample4(25, 'B');
        System.out.println("obj2: character = " + obj2.character + ", number = " + obj2.number);
    }
}