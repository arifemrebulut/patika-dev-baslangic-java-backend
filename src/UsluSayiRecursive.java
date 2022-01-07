import java.util.Scanner;

public class UsRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taban, us, toplam;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        taban = scanner.nextInt();
        toplam = taban;

        System.out.print("Üs olacak sayıyı giriniz: ");
        us = scanner.nextInt();

        System.out.println("Sonuç: " + usAlma(taban, us));
    }

    public static int usAlma(int taban, int us){
        if (us != 0) {
            return (taban * usAlma(taban, us - 1));
        }
        else {
            return 1;
        }
    }
}
