public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(1010, 10));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(9, 18));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int great1stDiv = 0;
        int great2ndDivisor = 0;

        if (first >= 10 && second >= 10) {

            int i = 1;
            while (i <= first && i <= second) {

                if (first % i == 0 && second % i == 0) {

                    if (great1stDiv < i) {

                        great1stDiv = i;
                    }
                    if (great2ndDivisor < i) {

                        great2ndDivisor = i;
                    }
                }

                i++;
            }
            if (first > second) {

                return great2ndDivisor;
            } else
                return great1stDiv;
        }

        return -1;
    }
}
