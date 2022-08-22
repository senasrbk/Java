import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int Month, Day;
        String zodiacSign = "";
        boolean error = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Doğduğunuz Ay: ");
        Month = sc.nextInt();

        System.out.println("Doğduğunuz Gün: ");
        Day = sc.nextInt();

        if (Month == 1) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 22) {
                    zodiacSign = "Oğlak";
                } else {
                    zodiacSign = "Kova";
                }
            } else
                error = true;
        } else if (Month == 2) {
            if (Day >= 1 && Day <= 28) {
                if (Day < 20) {
                    zodiacSign = "Kova";
                } else {
                    zodiacSign = "Balık";
                }
            } else
                error = true;

        } else if (Month == 3) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 21) {
                    zodiacSign = "Balık";
                } else {
                    zodiacSign = "Koç";
                }
            } else
                error = true;

        } else if (Month == 4) {
            if (Day >= 1 && Day <= 30) {
                if (Day < 21) {
                    zodiacSign = "Koç";
                } else {
                    zodiacSign = "Boğa";
                }
            } else
                error = true;

        } else if (Month == 5) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 22) {
                    zodiacSign = "Boğa";
                } else {
                    zodiacSign = "İkizler";
                }
            } else
                error = true;
        } else if (Month == 6) {
            if (Day >= 1 && Day <= 30) {
                if (Day < 23) {
                    zodiacSign = "İkizler";
                } else {
                    zodiacSign = "Yengeç";
                }
            } else
                error = true;
        } else if (Month == 7) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 23) {
                    zodiacSign = "Yengeç";
                } else {
                    zodiacSign = "Aslan";
                }
            } else
                error = true;
        } else if (Month == 8) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 23) {
                    zodiacSign = "Aslan";
                } else {
                    zodiacSign = "Başak";
                }
            } else
                error = true;
        } else if (Month == 9) {
            if (Day >= 1 && Day <= 30) {
                if (Day < 23) {
                    zodiacSign = "Başak";
                } else {
                    zodiacSign = "Terazi";
                }
            } else
                error = true;
        } else if (Month == 10) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 23) {
                    zodiacSign = "Terazi";
                } else {
                    zodiacSign = "Akrep";
                }
            } else
                error = true;
        } else if (Month == 11) {
            if (Day >= 1 && Day <= 30) {
                if (Day < 22) {
                    zodiacSign = "Akrep";
                } else {
                    zodiacSign = "Yay";
                }
            } else
                error = true;
        } else if (Month == 12) {
            if (Day >= 1 && Day <= 31) {
                if (Day < 22) {
                    zodiacSign = "Yay";
                } else {
                    zodiacSign = "Oğlak";
                }
            } else
                error = true;
        }
        if (error) {
            System.out.println("Hatalı doğum tarihi");
        }
        System.out.println(zodiacSign);
        sc.close();
    }
}
