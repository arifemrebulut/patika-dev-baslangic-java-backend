import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double boy = 0;
        double kilo = 0;
        double vucutKitleIndeksi = 0;

        System.out.print("Lütfen boyunuzu giriniz (örn: 1,83): ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücüt kitle indeksiniz: " + vucutKitleIndeksi);
    }

}