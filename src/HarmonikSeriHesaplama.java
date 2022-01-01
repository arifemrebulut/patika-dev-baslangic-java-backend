import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = 0, sum = 0;

        System.out.print("Lütfen n değerini giriniz: ");
        n = scanner.nextDouble();

        for (double i = 1; i <= n; i++){
            sum += 1 / i;
        }

        System.out.println("N değerinin harmonik seri toplamı: " + sum);
    }
}
