import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {

    public static void main(String[] args){
        double distansePrice = 0.10;
        int distanceInput, ageInput, ticketType;
        double grossPrice, netPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        distanceInput = scanner.nextInt();
        if (distanceInput < 0) {System.out.println("Hatalı bilgi girdiniz!");}

        System.out.print("Lütfen yaşınızı giriniz: ");
        ageInput = scanner.nextInt();
        if (ageInput < 0) {System.out.println("Hatalı bilgi girdiniz!");}

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş)");
        ticketType = scanner.nextInt();
        if (ticketType < 1 || ticketType > 2) {System.out.println("Hatalı bilgi girdiniz!");}

        grossPrice = distanceInput * distansePrice;

        if (ageInput < 12){
            grossPrice *= 0.5;
        } else if (ageInput >= 12 && ageInput <= 24){
            grossPrice *= 0.9;
        } else if (ageInput >= 65) {
            grossPrice *= 0.7;
        }

        if (ticketType == 2) {
            netPrice = grossPrice * 0.8;
        } else {
            netPrice = grossPrice;
        }

        System.out.println("Toplam Tutar: " + netPrice);
    }
}
