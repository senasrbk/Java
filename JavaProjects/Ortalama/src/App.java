import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        Scanner not = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        Matematik = not.nextInt();

        System.out.print("Fizik Notu: ");
        Fizik = not.nextInt();

        System.out.print("Kimya Notu: ");
        Kimya = not.nextInt();

        System.out.print("Turkce Notu: ");
        Turkce = not.nextInt();

        System.out.print("Tarih Notu: ");
        Tarih = not.nextInt();

        System.out.print("Muzik Notu: ");
        Muzik = not.nextInt();

        int Toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);
        double Ortalama = Toplam / 6;
        System.out.print("Ortalama: " + Ortalama);
    }
}
