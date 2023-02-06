class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));

    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }
        while (number % 2 == 0) {
            number /= 2;
        }

        int lastDivisor = 2;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            lastDivisor = i;
            while (number % i == 0) {
                number /= i;
            }
        }

        return number == 1 ? lastDivisor : number;
    }
}