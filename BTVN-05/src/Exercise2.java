public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (isPrime(i) && isPrime(reverseNumber(i))) {
                System.out.println(i);
            }
        }
    }
public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

    public static int reverseNumber(int a) {
        int reversedNum = 0;
        while (a > 0) {
            int digit = a % 10;
            reversedNum = reversedNum * 10 + digit;
            a /= 10;
        }
        return reversedNum;
    }
}
