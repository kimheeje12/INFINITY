package Ch2;

import java.util.Scanner;

public class Circle_END {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("---------------원 그리기--------------");
            System.out.println("※ 숫자를 입력하세요");
            System.out.println("------------------------------------------");
            num = input.nextInt();
            if (num < 2) {
                System.out.println("2이상 숫자를 입력하세요");
            }else  if (num == 101) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            for (int i = 0; i <= num * 2; i++) {
                for (int j = 0; j <= num * 2; j++) {
                    System.out.print("   ");
                    int k = (int) Math.sqrt((i-num)*(i-num)+(j-num)*(j-num));     // 피타고라스의 정리(근의 공식), input 값 기준,,
                    if (k <= num)
                        System.out.print("* ");
                    else
                        System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}
