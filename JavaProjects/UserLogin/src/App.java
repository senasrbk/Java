import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
        // sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        // ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
        // ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
        // "Şifre oluşturuldu" yazan programı yazınız.
        String username, password, choice, newPassword;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı Adı: ");
        username = sc.nextLine();

        System.out.println("Şifre: ");
        password = sc.nextLine();

        if (username.equals("username") && password.equals("password"))
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        else if (username.equals("username") && !password.equals("password")) {
            System.out.println("Girilen şifre yanlış. Yeni şifre oluşturmak ister misiniz?(y/n)");
            choice = sc.nextLine();
            if (choice.equals("y")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                newPassword = sc.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    newPassword = sc.nextLine();
                    while (!newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                        newPassword = sc.nextLine();
                    }
                }
                password = newPassword;
            }

        } else if (username.equals("username") && !password.equals("password"))
            System.out.println("Kullanıcı Adı yanlış.");
        else
            System.out.println("Girilen bilgiler yanlış.");
    }
}
