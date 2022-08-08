import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        // 𝑢 = (a+b+c) / 2

        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

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
