public class FirstAndLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));

    }

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit;
        int lastDigit = number % 10;

        if (number < 0) {
            return -1;
        }
        else {
            while (number >= 10) {
                number = number / 10;
            }
            firstDigit = number;
        }
        return firstDigit + lastDigit;
    }

}
