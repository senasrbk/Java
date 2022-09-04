import java.util.Scanner;

public class App {
    static boolean isPrime(int a, int b) {
        if (a <= 2)
            return (a == 2) ? true : false;
        if (a % b == 0)
            return false;
        if (b * b > a)
            return true;

        return isPrime(a, b + 1);

    }

    public static void main(String[] args) throws Exception {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        number = sc.nextInt();

        if (isPrime(number, 2))
            System.out.println(number + " Asal Sayı");
        else
            System.out.println(number + " Asal Sayı Değil");
        sc.close();
    }
}
