import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Satir sayisi: ");
        int row = sc.nextInt();
        System.out.print("Sutun sayis: ");
        int col = sc.nextInt();
        Minesweeper mine = new Minesweeper(row, col);
        mine.run();
        sc.close();
    }
}
