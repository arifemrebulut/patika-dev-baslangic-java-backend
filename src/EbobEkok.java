import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, n1result = 0;
        int ebob = 0, ekok = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen küçük sayıyı giriniz: ");
        n1 = scanner.nextInt();

        System.out.print("Lütfen büyük sayıyı giriniz: ");
        n2 = scanner.nextInt();

        int i = 1;
        while (i <= n1){
            if (n1 % i == 0 && n2 % i == 0){
                n1result = i;
            }
            i++;
        }

        int k = n1;
        while (k >= 1){
            if (n1 % k == 0 && n2 % k == 0){
                if (n1result == k){
                    ebob = k;
                    break;
                }
            }
            k--;
        }

        ekok = ((n1 * n2) / ebob);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
