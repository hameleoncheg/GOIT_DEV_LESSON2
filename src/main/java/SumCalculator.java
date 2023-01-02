public class SumCalculator {

    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    public  static int sum(int n) {
        int sum = 0;
        if (n <= 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
