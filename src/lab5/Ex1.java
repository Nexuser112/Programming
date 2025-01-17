package lab5;

public class Ex1 {
    public static class ClassExample1 {
        private char character;

        public void setCharacter(char character) {
            this.character = character;
        }

        public int getCharacterCode() {
            return (int) character;
        }

        public void printCharacterAndCode() {
            System.out.printf("Символ = %c, Код = %d%n", character, getCharacterCode());
        }
    }

    public static void main(String[] args) {
        ClassExample1 example = new ClassExample1();
        example.setCharacter('A');
        example.printCharacterAndCode();
    }
}