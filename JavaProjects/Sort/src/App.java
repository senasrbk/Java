import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sayı: ");
        a = sc.nextInt();

        System.out.println("2. Sayı: ");
        b = sc.nextInt();

        System.out.println("3. Sayı: ");
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }

        sc.close();
    }
}
