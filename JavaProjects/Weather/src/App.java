import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int degree;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bugün sıcaklık: ");
        degree = sc.nextInt();

        if (degree < 5) {
            System.out.println("Bu sıcaklıkta kayak yapabilirsiniz.");
        } else if (degree >= 5 && degree < 15) {
            System.out.println("Bu sıcaklıkta sinemaya gidebilirsiniz.");
        } else if (degree >= 15 && degree < 25) {
            System.out.println("Bu sıcaklıkta piknik yapabilirsiniz.");
        } else if (degree >= 25) {
            System.out.println("Bu sıcaklıkta yüzmeye gidebilirsiniz.");
        }

        sc.close();
    }
}
