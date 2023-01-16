public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(10));
        System.out.println(isValid(1051));

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num2 < 10 || num3 < 10) {

            return false;

        } else  if (num1 > 1000 || num2 > 1000 || num3 > 1000) {

            return false;

            } else {

                int lastNum1 = num1 % 10;
                int lastNum2 = num2 % 10;
                int lastNum3 = num3 % 10;

                return lastNum1 == lastNum2 || lastNum1 == lastNum3 || lastNum2 == lastNum3;
            }
        }

    }
