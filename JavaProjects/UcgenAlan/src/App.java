import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข

        // ๐ข = (a+b+c) / 2

        // Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)

        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kenar: ");
        a = sc.nextInt();

        System.out.println("2. Kenar: ");
        b = sc.nextInt();

        System.out.println("2. Kenar: ");
        c = sc.nextInt();

        int cevre = (a + b + c) / 2;
        double alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));

        System.out.println("Alan: " + alan);
    }
}
