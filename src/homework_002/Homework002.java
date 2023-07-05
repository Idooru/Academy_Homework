package homework_002;

public class Homework002 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 12;
        int num3 = 5, num4 = 6;

        // 10의 약수
        System.out.printf("%d의 약수 : ", num1);
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.printf("%d, ", i);
            }
        }

        System.out.println();

        // 12의 약수
        System.out.printf("%d의 약수 : ", num2);
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                System.out.printf("%d, ", i);
            }
        }

        System.out.println();

        // 10과 12의 최대공약수
        System.out.printf("%d와 %d의 최대공약수 : ", num1, num2);
        Out:
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                if (i > 1 && j > 1) {
                    if (num1 % i == num2 % j) {     // 이 부분을 수정해서 다시 올립니다.
                        System.out.printf("%d", j);

                        break Out;
                    }
                }
            }
        }

        System.out.println();

        // 5의 배수
        System.out.printf("%d의 배수 : ", num3);
        for (int i = 1; i <= num3 * num4; i++) {
            System.out.printf("%d, ", num3 * i);

            if (i == ((num3 * num4) / num3)) {
                break;
            }
        }

        System.out.println();

        // 6의 배수
        System.out.printf("%d의 배수 : ", num4);
        for (int i = 1; i <= num3 * num4; i++) {
            System.out.printf("%d, ", num4 * i);

            if (i == ((num3 * num4) / num4)) {
                break;
            }
        }

        System.out.println();

        // 5와 6의 최소 공배수 구하기
        int i = 1;
        int lcm = 0;

        while (true) {
            int multiply1 = num3;
            int multiply2 = num4;

            int multiplex1 = multiply1 * i;
            int multiplex2 = multiply2 * i;

            if (((multiplex1 / num3) == (num3 * num4)) && ((multiplex2 / num4) == (num3 * num4))) {
                int smallest1 = multiplex1 / (num3 * num4);
                int smallest2 = multiplex2 / (num3 * num4);

                lcm = smallest1 * smallest2;

                break;
            }

            i++;
        }

        System.out.printf("%d와 %d의 최소 공배수 : %d\n ", num3, num4, lcm);
    }
}
