package Loop;

import java.util.Scanner;

public class Star3 {
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

            int i = 0;
            int p = 0;
            int j = 0;
            int k = 0;
            //별 머리!
            for (i = 0; i < num; i ++) {
                for (p = 0; p < num; p++) {
                    System.out.print("aa");
                }
                for (j = num; j >= i; j ++) {
                    System.out.print("aa");
                }
                for (k=0; k <= i; k++) {
                    System.out.print("★");
                }
                System.out.println();
            }
            for (i=0; i<(num/2); i++){
                for(j=0; j<i; j++){
                    System.out.print("");
                }
                for(int q=0; q<num*3; q++){
                    if (k < num*3){
                        System.out.print("★");
                    }
                }
            }
        }
    }
}

