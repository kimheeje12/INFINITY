package Ch2;

import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {

        int num;
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

                                                                                                                        //별 머리
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j <= 3*num-i; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i*2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
                                                                                                                        // 별 가슴
            for (int i = 4*num; i >=2*num; i--) {
                for (int j = 0; j <=4*num-i; j++) {
                    System.out.print("      ");
                }
                for (int k = 1; k <= i*2 - 1; k++) {
                    if (i < 4* num-i)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
                                                                                                                        // 별 허리
            for (int i = 4*num; i >=3*num+3; i--) {
                for (int j = 0; j <=4*num-i; j++) {
                    System.out.print("a");
                }
                for (int k = 1; k <= i*2 - 1; k++) {
                    if (i < num-i)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
                                                                                                                        //별 다리
            for (int i = 1; i <= num; i++) {
                for (int j = 0; j <= 3*num-i; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i*2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= num; i++) {
                for (int j = 0; j <= 3 * num - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}