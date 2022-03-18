package Loop;

import java.util.Random;
import java.util.Scanner;

public class Sudoku7 {
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
            int ran = 0;
            int q;
            int w;
            int column;
            int row;
            int rand;
            int count = 0;
            boolean bool = true;

            for(int i =0; i<n; i++){                                                                         //초기화
                for(int j=0;j<n; j++){
                    map[i][j]=0;
                }
            }

            puzzle: while (true) {                                                                          //1열 중복되지 않는 랜덤 난수 생성
                count=0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        row = j;
                        column = i;

                        puzzle2: while (true) {
                            ran = random.nextInt(n) + 1;
                            map[i][j] = ran;

                            for (q = column-1; q >= 0; q--) {                                        //아래->위로 중복체크
                                while (bool == true) {
                                    if (map[i][j] == map[i][q]) {
                                        bool = true;
                                        continue puzzle2;
                                    } else {
                                        bool = false;
                                    }
                                }
                                bool = true;
                            }

                            for (w = row-1; w >= 0; w--) {                                             //우->좌로 중복체크
                                while (bool == true) {
                                    if (map[i][j] == map[w][j]) {
                                        count++;
                                        if(count>1){
                                            continue puzzle;
                                        }
                                        bool = true;
                                        continue puzzle2;
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
                for (int i = 0; i < n; i++) {                                                                //최종출력
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
