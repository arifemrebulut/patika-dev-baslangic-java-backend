import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = scanner.nextInt();

        int result = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.print("C(" + n + "," + r + ") = " + result);
    }

    static int factorial(int factNum) {
        int sum = 1;

        for (int i = 1; i <= factNum; i++) {
            sum *= i;
        }

        return sum;
    }
}
