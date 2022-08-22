import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int birthYear;
        String zodiacSign = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Doğduğunuz Yıl: ");
        birthYear = sc.nextInt();

        if (birthYear % 12 == 0) {
            zodiacSign = "Maymun";
        } else if (birthYear % 12 == 1) {
            zodiacSign = "Horoz";
        } else if (birthYear % 12 == 2) {
            zodiacSign = "Köpek";
        } else if (birthYear % 12 == 3) {
            zodiacSign = "Domuz";
        } else if (birthYear % 12 == 4) {
            zodiacSign = "Fare";
        } else if (birthYear % 12 == 5) {
            zodiacSign = "Öküz";
        } else if (birthYear % 12 == 6) {
            zodiacSign = "Kaplan";
        } else if (birthYear % 12 == 7) {
            zodiacSign = "Tavşan";
        } else if (birthYear % 12 == 8) {
            zodiacSign = "Ejderha";
        } else if (birthYear % 12 == 9) {
            zodiacSign = "Yılan";
        } else if (birthYear % 12 == 10) {
            zodiacSign = "At";
        } else if (birthYear % 12 == 11) {
            zodiacSign = "Koyun";
        }
        System.out.println("Chinese Zodiac Sign:" + zodiacSign);
        sc.close();
    }
}
