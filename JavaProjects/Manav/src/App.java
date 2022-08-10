import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        int a = sc.nextInt();

        System.out.println("Elma Kaç Kilo ? :");
        int e = sc.nextInt();

        System.out.println("Domates Kaç Kilo ? :");
        int d = sc.nextInt();

        System.out.println("Muz Kaç Kilo ? :");
        int m = sc.nextInt();

        System.out.println("Patlican Kaç Kilo ? :");
        int p = sc.nextInt();

        double toplam = (a * Armut) + (e * Elma) + (d * Domates) + (m * Muz) + (p * Patlican);
        System.out.println("Toplam Tutar : " + toplam);
    }
}
