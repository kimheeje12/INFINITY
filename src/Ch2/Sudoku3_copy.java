package Ch2;

import java.util.Random;
import java.util.Scanner;

public class Sudoku3_copy {
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

            int a;
            int b;
            int row;
            int col;
            boolean bool = true;
            int count = 0;
            int rand;

            puzzle2:
            while (true) {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        row = j;
                        col = i;

                        puzzle1:
                        while (true) {
                            rand = random.nextInt(n) + 1;
                            map[i][j] = rand;

                            for (a = row - 1; a >= 0; a--) {
                                while (bool == true) {

                                    if (map[i][j] == map[i][a]) {
                                        bool = true;
                                        continue puzzle1;
                                    } else {
                                        bool = false;
                                    }
                                }
                                bool = true;
                            }

                            for (b = col - 1; b >= 0; b--) {
                                while (bool == true) {
                                    if (map[i][j] == map[b][j]) {
                                        count++;
                                        if (count > 300) {
                                            continue puzzle2;
                                        }
                                        bool = true;
                                        continue puzzle1;
                                    } else {
                                        bool = false;
                                    }
                                }
                                bool = true;
                            }
                            break;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(map[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}



