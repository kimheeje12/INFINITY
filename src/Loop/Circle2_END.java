package Loop;

import java.util.Scanner;

public class Circle2_END {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        while (true) {
            System.out.println();
            System.out.println("---------------원 그리기--------------");
            System.out.println("※ 숫자를 입력하세요");
            System.out.println("------------------------------------------");
            num = input.nextInt();

            if (num < 2) {
                System.out.println("2이상 숫자를 입력하세요");
            } else if (num == 101) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            for (int i =-num; i <= num ; i++) {
                for (int j =-num; j <= num; j++) {
                    if(i*i + j*j < num*num){                                                            // X*X + Y*Y = R*R (원의 공식)
                        System.out.print("*  ");
                    } else {
                        System.out.print("    ");                                                         // 타원형 원을 동그랗게! (띄워쓰기)
                    }
                }
                System.out.println();
            }
        }
    }
}