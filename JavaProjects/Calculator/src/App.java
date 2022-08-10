import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number1, number2, operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("İlk Sayı: ");
        number1 = sc.nextInt();
        System.out.println("İkinci Sayı: ");
        number2 = sc.nextInt();

        System.out.println("Aşağıdaki dört işlemden seçiminizi yapınız.");
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
        System.out.println("İşlem: ");
        operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Toplama işlemninin sonucu: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma işlemninin sonucu: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma işlemninin sonucu: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Bölme işlemninin sonucu: " + (number1 / number2));
                break;
        }

    }
}
