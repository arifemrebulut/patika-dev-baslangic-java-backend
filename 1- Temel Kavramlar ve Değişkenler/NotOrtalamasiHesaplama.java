import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] dersIsimleri = new String[] {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] dersNotlari = new int[6];
        int ortalama = 0;

        for (int i = 0; i < dersIsimleri.length; i++){
            System.out.println(dersIsimleri[i] + " Dersi notunuzu giriniz");
            dersNotlari[i] = scanner.nextInt();
        }

        int toplam = 0;

        for (int i = 0; i < dersNotlari.length; i++){
            toplam += dersNotlari[i];
        }

        ortalama = toplam / dersNotlari.length;

        System.out.println("Not Ortalamanız : " + ortalama);
    }

}
