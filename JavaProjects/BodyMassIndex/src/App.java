import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double height, weight, bmi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = sc.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = sc.nextDouble();

        bmi = (weight / (height * height));
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
