public class EX_factorial {
    /*
        실행과정
     *  factorial(5) → 5 * factorial(4)
        factorial(4) → 4 * factorial(3)
        factorial(3) → 3 * factorial(2)
        factorial(2) → 2 * factorial(1)
        factorial(1) → 1 * factorial(0)
        factorial(0) → 1 (기본 조건)
    */

    /*
     *  계산 순서
     *  factorial(1) = 1 * 1 = 1
        factorial(2) = 2 * 1 = 2
        factorial(3) = 3 * 2 = 6
        factorial(4) = 4 * 6 = 24
        factorial(5) = 5 * 24 = 120
     * 
    */
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n -1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + " != " + factorial(num));
    }
}
