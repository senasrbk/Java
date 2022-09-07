import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int row, col;
    String[][] map;
    int[][] board;
    int mineCount;

    Minesweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new String[row][col];
        this.board = new int[row][col];
        this.mineCount = (row * col) / 4;

    }

    public void run() {
        int dogru = 0;
        game();
        System.out.println("--------------");
        while (true) {
            printMap(board);
            System.out.print("satir gir: ");
            int rown = scan.nextInt();
            System.out.print("sütun gir: ");
            int coln = scan.nextInt();
            if (map[rown][coln] != "*") {
                check(rown, coln);
                dogru++;
                if (dogru == (mineCount * 4 - mineCount)) {
                    System.out.println("Tebrikler Oyunu Kazandiniz :)");
                    break;
                }
            } else {
                System.out.println("Game Over");
                break;
            }

        }
    }

    public void game() {
        int rows, cols;
        int say = 0;

        while (say < mineCount) {
            rows = rand.nextInt(row);
            cols = rand.nextInt(col);
            if (map[rows][cols] != "*") {
                map[rows][cols] = "*";
                say++;
            }
        }
        int i, j;
        for (i = 0; i < map.length; i++) {
            for (j = 0; j < map[i].length; j++) {
                if (map[i][j] != "*") {
                    map[i][j] = "-";

                }
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }

    }

    public void check(int r, int c) {
        if (map[r][c] == "-") {
            if ((c < col - 1) && map[r][c + 1] == "*") {
                board[r][c]++;
            }
            if ((r < row - 1) && map[r + 1][c] == "*") {
                board[r][c]++;
            }
            if (r > 0 && map[r - 1][c] == "*") {
                board[r][c]++;
            }
            if (c > 0 && map[r][c - 1] == "*") {
                board[r][c]++;
            }

            if (board[r][c] == 0) {
                board[r][c] = -2;
            }

        }

    }

    public void printMap(int[][] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}