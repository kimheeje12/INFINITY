package Ch2;

import java.util.Random;
import java.util.Scanner;

public class Sudoku4_END {
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

            // input 값에 맞는 n x n (2차원 배열)  생성 (1행은 랜덤 난수 넣기 + 중복제외)
            // 1행 생략 / 2행부터 ... 각 행 랜덤 난수 생성 -> 행/열 중복체크 -> 행 형성
            // 한 줄씩 아래로 추가되면서 랜덤퍼즐 완성

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

            for(int i =0; i<n; i++){                                                                         // 초기화
                for(int j=0;j<n; j++){
                    map[i][j]=0;
                }
            }

            boolean Sudoku;                                                                               // 중복되지 않는 랜덤 난수 1차원 배열 생성
            for (int i = 0; i < n; i++) {
                ran = random.nextInt(n) + 1;
                Sudoku = true;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == ran) {
                        i--;
                        Sudoku = false;
                    }
                }
                if (Sudoku)
                    arr[i] = ran;
            }
            puzzle: while (true) {                                                                          // 중복되지 않는 랜덤 난수 1열에 삽입
                count=0;
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < n; j++) {
                        map[i][0] = arr[i];
                        row = i;
                        column = j;

                        puzzle2: while (true) {
                            ran = random.nextInt(n) + 1;
                            map[i][j] = ran;
                            for (q = column-1; q >= 0; q--) {                                        // 우 -> 좌로 중복체크
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
                            for (w = row-1; w >= 0; w--) {                                             // 아래 -> 위로 중복체크
                                while (bool == true) {
                                    if (map[i][j] == map[w][j]) {
                                        count++;
                                        if(count>400){                                                        // 무한루프 방지
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
