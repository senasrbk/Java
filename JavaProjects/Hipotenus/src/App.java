import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int a, b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kenar: ");
        a = sc.nextInt();

        System.out.println("2. Kenar: ");
        b = sc.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Karşi Kenar(Hipotenüs): " + c);
    }
}
