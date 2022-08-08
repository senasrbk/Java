import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int km;
        double perKm = 2.20, total = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Gidilen KM: ");
        km = sc.nextInt();

        total += (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.println(total);
    }
}
