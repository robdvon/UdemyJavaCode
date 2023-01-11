public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(129));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit = 0;
        int num = number;

        while (num != 0) {

            lastDigit = num % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            num = num / 10;
        }
        return number == reverse;
    }
}