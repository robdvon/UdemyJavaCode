public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number) {

        int i = 1;
        int perfectTest = 0;

        if (number > 1) {

            while (i < number) {

                if (number % i == 0) {

                    perfectTest = perfectTest + i;
                }

                i++;
            }
            return number == perfectTest;
        }
        return false;
    }
}
