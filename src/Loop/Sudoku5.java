package Loop;

import java.util.Random;
import java.util.Scanner;

public class Sudoku5 {
    public static void main(String[] args) {

        int n = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("-----------스도쿠 만들기---------");
            System.out.println("※ 숫자를 입력하세요");
            System.out.println("----------------------------------------");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("숫자를 입력하세요");
            } else if (n == 101) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            Random random = new Random();
            int[][] map2 = new int[n][n];
            int[] map = new int[n];
            int ran = 0;

            boolean check;
            for (int i = 0; i < n; i++) {
                ran = random.nextInt(n) + 1;
                check = true;
                for (int j = 0; j < i; j++) {
                    if (map[j] == ran) {
                        i--;
                        check = false;
                    }
                }
                if (check)
                    map[i] = ran;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(map[i]);
            }
        }
    }
}