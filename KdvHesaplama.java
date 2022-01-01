import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double girilenFiyat = 0;
        double kdvsizFiyat = 0;
        double kdvliFiyat = 0;
        double kdvTurari = 0;
        double kdvOrani = 0;

        System.out.print("Lütfen KDV'li fiyatını ve KDV tutarını öğrenmek istediğiniz fiyatı giriniz: ");
        girilenFiyat = scanner.nextInt();
        kdvOrani = (girilenFiyat < 1000) ? 8 : 18;

        kdvTurari = girilenFiyat * (kdvOrani / 100);
        kdvliFiyat = girilenFiyat + kdvTurari;
        kdvsizFiyat = girilenFiyat;


        System.out.println("KDV'siz Fiyat: " + kdvsizFiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTurari);
    }

}
