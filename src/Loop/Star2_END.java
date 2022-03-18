package Loop;

import java.util.Scanner;

public class Star2_END {
    public static void main(String[] args) {

        double num;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("---------------별 그리기--------------");
            System.out.println("※ 숫자를 입력하세요");
            System.out.println("------------------------------------------");
            num = input.nextInt();

            if (num < 3) {
                System.out.println("3이상 숫자를 입력하세요");
            } else if (num == 101) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            //별 머리!
            for (double i = 0; i <= 1.618 * num; i++) {                                       // num 변화에 따른 배율을 어떻게 조정할 것인가? 조건문? 아니면 반복문 추가?
                for (double j = 0; j <= 4.236 * num - i - 1.618; j++) {
                    System.out.print("    ");
                }
                for (double k = 0; k < i * 2 - 1; k++) {
                    System.out.print("★");
                }
                System.out.println();
            }
            // 별 몸통 1                                                                                         // 1:1.618 (황금비율)  / 1.618 : 1 : 1.618
            for (double i = 4.236 * num; i >= 2.618 * num; i--) {
                for (double j = 0; j < 4.236 * num - i; j++) {
                    System.out.print("    ");
                }
                for (double k = 1; k < i * 2 - 1; k++) {
                    if (i <= 2.618 * num)
                        System.out.print(" ");
                    else
                        System.out.print("★");
                }
                System.out.println();
            }
                                                                                                                        // 별 몸통 2
            for (double i = 2.618 * num; i >= 2.618 * num; i--) {
                for (double j = 0; j < 2.618 * num/2; j++) {
                    System.out.print("     ");
                }
                for (double k = 1; k < i * 2 - 1; k++) {
                    if (i <= num)
                        System.out.print(" ");
                    else
                        System.out.print("★");
                }
                System.out.println();
            }
                                                                                                                        // 별 다리!
            int count = 0;
            for (double i = 1.3 * num; i > 0; i--) {
                for (double j = 0; j <= i; j++) {
                    System.out.print("     ");
                }
                for (double k = 0; k < i * 2 - 1; k++) {
                    if (i <= 1.618 * num)
                        System.out.print("★");
                    else
                        System.out.print("  ");
                }
                for (double j = 0; j < count; j++) {
                    System.out.print("     ");
                }
                for (double k = 0; k < i * 2 - 1; k++) {
                    if (i <= 1.618 * num)
                        System.out.print("★");
                    else
                        System.out.print("  ");
                }
                count += 5.5;
                System.out.println();
            }
        }
    }
}

