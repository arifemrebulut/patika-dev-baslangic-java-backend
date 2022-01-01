import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int girilenKm;
        int taksimetreAcilisUcreti = 10;
        int minimumTutar = 20;
        double taksimetreKmCarpani = 2.2;
        double tutar = 0;
        double sonuc = 0;

        System.out.print("Lütfen kaç km gidildiğini giriniz: ");
        girilenKm = scanner.nextInt();

        tutar = 10 + (girilenKm * taksimetreKmCarpani);
        sonuc = (tutar < 20) ? 20 : tutar;

        System.out.println("Tutar: " + sonuc);
    }

}
