import java.util.Scanner;

public class App {
    static int isNegative(int a) {

        if (a <= 0) {
            return a;
        } else {
            System.out.print(a + " ");
            return isNegative(a - 5);
        }

    }

    static int isPositive(int a, int b) {

        if (a > b) {
            return a;
        } else {
            System.out.print(a + " ");
            return isPositive(a + 5, b);
        }

    }

    public static void main(String[] args) throws Exception {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        number = sc.nextInt();

        while (number != 0) {
            isPositive(isNegative(number), number);

            System.out.println("\nCikmak icin 0'i giriniz.");
            System.out.println("Number: ");
            number = sc.nextInt();

        }
        sc.close();
    }
}
