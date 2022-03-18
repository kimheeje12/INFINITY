package Ch2;

import java.util.Random;
import java.util.Scanner;

public class Sudoku6 {
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

            int[][] map = new int[n][n];
            int[] arr = new int[n];
            int a;
            int b;
            int row;
            int col;
            boolean bool = true;
            int count = 0;
            int ran=0;
            int rand;

            boolean check;
            for (int i = 0; i < n; i++) {
                ran = random.nextInt(n) + 1;
                check = true;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == ran) {
                        i--;
                        check = false;
                    }
                }
                if (check)
                    arr[i] = ran;
            }
            for(int i = 0; i <n; i++){
                for(int j=0; j<n; j++){
                    map[i][0]=arr[i];
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(map[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }
}
