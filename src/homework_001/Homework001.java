package homework_001;

public class Homework001 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i + 1; j <= i + 5; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
