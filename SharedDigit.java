public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hadSharedDigit(-12, 23));
        System.out.println(hadSharedDigit(9, 99));
        System.out.println(hadSharedDigit(15, 55));
    }

    public static boolean hadSharedDigit(int numA, int numB) {

        if (numA < 10 || numB < 10 || numA > 99 || numB > 99) {
            return false;
        }
        else {
            int firstNumADigit = numA % 10;
            int secondNumADigit = numA - firstNumADigit;
            int firstNumBDigit = numB % 10;
            int secondNumBDigit = numB - firstNumBDigit;

            if (secondNumADigit % 10 == 0) {
                secondNumADigit = secondNumADigit / 10;
            } else {
                secondNumADigit = secondNumADigit % 10;
            }
            if (secondNumBDigit % 10 == 0) {
                secondNumBDigit = secondNumBDigit / 10;
            } else {
                secondNumBDigit = secondNumBDigit % 10;
            }

            if (firstNumADigit == firstNumBDigit) {
                return true;
            } else if (firstNumADigit == secondNumBDigit) {
                return true;
            } else if ((secondNumADigit == firstNumBDigit)) {
                return true;
            } else return secondNumADigit == secondNumBDigit;

        }
    }

}