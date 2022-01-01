import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taban, us, toplam;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        taban = scanner.nextInt();
        toplam = taban;

        System.out.print("Üs olacak sayıyı giriniz: ");
        us = scanner.nextInt();

        for (int i = 1; i <= us; i++){
            toplam *= taban;
        }

        System.out.println("Sonuç: " + toplam);
    }
}
