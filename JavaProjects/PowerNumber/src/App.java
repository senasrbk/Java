import java.util.Scanner;

public class App {
    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }

    }

    public static void main(String[] args) throws Exception {

        int number1, number2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        number1 = sc.nextInt();
        System.out.println("Power: ");
        number2 = sc.nextInt();
        System.out.println("Sonuc: " + pow(number1, number2));
        sc.close();
    }
}
