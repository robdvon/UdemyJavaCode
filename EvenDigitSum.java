public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {

        int evens = 0;
        int checkIfEven;

        if (number < 0) {
            return -1;
        }
        else {
            while (number >= 1) {

                checkIfEven = number % 10;
                number = number / 10;

                if (checkIfEven % 2 == 0) {
                    evens += checkIfEven;
                }
            }
        }

        return evens;
    }
}
