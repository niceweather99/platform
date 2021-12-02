import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a begin number: ");
        int begin = scanner.nextInt();

        System.out.println("Enter an end number: ");
        int end = scanner.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }

    private static long getSumBetween(final int n, final int m) {
        int sum = 0;

        for(int i=n; i<=m; i++){
            sum = sum + i;
        }

        return sum;
    }

    private static long getProductBetween(final int n, final int m) {
        int fac = 1;

        for(int i=n; i<=m; i++){
            fac = fac * i;
        }

        return fac;
    }
}
