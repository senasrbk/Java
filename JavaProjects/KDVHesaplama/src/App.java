import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double Tutar, KDVOran = 0.18, KDVTutar, SonTutar;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ücreti giriniz: ");
        Tutar = sc.nextDouble();

        KDVTutar = KDVOran * Tutar;
        SonTutar = Tutar + KDVTutar;

        System.out.println("Tutar: " + Tutar);
        System.out.println("KDVOran: " + KDVOran);
        System.out.println("KDVTutar: " + KDVTutar);
        System.out.println("SonTutar: " + SonTutar);
    }
}
