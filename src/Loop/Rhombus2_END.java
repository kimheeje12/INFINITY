package Loop;

import java.util.Scanner;

public class Rhombus2_END {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("-----------마름모 그리기2---------");
            System.out.println("※ 숫자를 입력하세요");
            System.out.println("------------------------------------------");
            num = input.nextInt();

            if (num < 2) {
                System.out.println("숫자를 입력하세요");
            }else  if (num == 101) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

                                                                                                                        // 마름모 상단!
            for (int i = 1; i <= num; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    if (k == 1 || k == (i * 2) - 1)
                        System.out.print("*");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
                                                                                                                        // 마름모 하단!
            for (int i = num - 1; i > 0; i--) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    if (k == 1 || k == i * 2 - 1)
                        System.out.print("*");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}

