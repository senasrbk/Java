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

        double Average = 0;
        int count = 0;
        if (Matematik >= 0 && Matematik <= 100) {
            Average += Matematik;
            count++;
        }
        if (Fizik >= 0 && Fizik <= 100) {
            Average += Fizik;
            count++;
        }
        if (Kimya >= 0 && Kimya <= 100) {
            Average += Kimya;
            count++;
        }
        if (Turkce >= 0 && Turkce <= 100) {
            Average += Turkce;
            count++;
        }
        if (Tarih >= 0 && Tarih <= 100) {
            Average += Tarih;
            count++;
        }
        if (Muzik >= 0 && Muzik <= 100) {
            Average += Muzik;
            count++;
        }
        Average = Average / count;

        if (Average <= 55) {
            System.out.println("Ortalamanız geçme notunun altında.");
            System.out.println("Ortalama: " + Average);
        } else {
            System.out.println("Ortalamanız geçme notunun üstünde.");
            System.out.println("Ortalama: " + Average);
        }

    }
}
