import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double armutKgFiyati = 2.14;
        double armutKg = 0;
        double elmaKgFiyati = 3.67;
        double elmaKg = 0;
        double domatesKgFiyati = 1.11;
        double domatesKg = 0;
        double muzKgFiyati = 0.95;
        double muzKg = 0;
        double patlicanFiyati = 5.00;
        double patlicanKg = 0;
        double toplam = 0;

        System.out.print("Armut Kg Giriniz: ");
        armutKg = scanner.nextDouble();
        System.out.print("Elma Kg Giriniz: ");
        elmaKg = scanner.nextDouble();
        System.out.print("Domates Kg Giriniz: ");
        domatesKg = scanner.nextDouble();
        System.out.print("Muz Kg Giriniz: ");
        muzKg = scanner.nextDouble();
        System.out.print("Patlıcan Kg Giriniz: ");
        patlicanKg = scanner.nextDouble();

        toplam = (armutKg * armutKgFiyati)
                + (elmaKg * elmaKgFiyati)
                + (domatesKg * domatesKgFiyati)
                + (muzKg * muzKgFiyati)
                + (patlicanKg * patlicanFiyati);

        System.out.println("Toplam Fiyat: " + toplam);
    }

}