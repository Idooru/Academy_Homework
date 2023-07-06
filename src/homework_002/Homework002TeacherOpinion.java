package homework_002;

public class Homework002TeacherOpinion {

  public static void main(String[] args) {
    int a = 10, b = 12, min = 0, gcd = 0;

    if (a < b) {
      min = a;
    } else {
      min = b;
    }

    for (int i = 1; i <= min; i++) { // i = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
      if (a % i == 0 && b % i == 0) {
        gcd = i; // gcd = 1, 2
      }
    }

    System.out.printf("%d와 %d의 최대공약수는 %d입니다.", a, b, gcd);

    int x = 5, y = 6, max = 0, lcd = 0;
    if (x < y) {
      max = y;
    } else {
      max = x;
    }

    for (int i = max;; i++) {
      if (i % x == 0 && i % y == 0) {
        lcd = i;
        break;
      }
    }

    System.out.printf("%d와 %d의 최소공배수는 %d입니다.", x, y, lcd);
  }
}
