import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int year;
        Scanner sc = new Scanner(System.in);
        boolean isLeap = false;
        System.out.println("Yıl: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            isLeap = true;
            if (year % 100 == 0) {
                isLeap = false;
                if (year % 400 == 0) {
                    isLeap = true;
                }
            }
        }

        if (isLeap == true) {
            System.out.println("Artık Yıl.");
        } else {
            System.out.println("Artık Yıl Değil.");
        }

        sc.close();
    }
}
