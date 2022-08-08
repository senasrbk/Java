import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int r;
        double pi = 3.14, a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz: ");
        r = sc.nextInt();

        System.out.println("Merkez açısı giriniz: ");
        a = sc.nextInt();

        double Alan = (pi * r * r);
        double Cevre = (2 * pi * r);
        double MerkezAciAlan = (pi * (r * r) * a) / 360;
        System.out.println("Alan: " + Alan + "\nCevre: " + Cevre + "\nMerkezAciAlan: " + MerkezAciAlan);

    }
}
