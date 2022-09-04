
public class App {

    static boolean isPalindrome(int number) {
        int temp = number, reverse = 0, last;
        while (temp != 0) {
            last = temp % 10;
            reverse = (reverse * 10) + last;
            temp /= 10;
        }

        if (number == reverse) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        isPalindrome(4918);
    }

}
