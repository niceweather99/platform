import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        long fac;

        for (int n=1; n<=x; n++) {
            fac = getFactorial(n);
            System.out.printf("Factorial of %d = %d\n", n, fac);
        }
    }

    private static long getFactorial(final int n){
        int j = 1;

        for (int i=1; i<=n; i++) {
            j = j * i;
        }

        return j;
    }
}
