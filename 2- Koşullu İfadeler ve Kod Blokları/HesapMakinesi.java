import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double number1, number2, selectedNumber;
        double sonuc = 0;

        System.out.print("İlk Sayıyı Giriniz: ");
        number1 = scanner.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        number2 = scanner.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        selectedNumber = scanner.nextInt();

        switch ((int) selectedNumber) {
            case 1:
                sonuc = number1 + number2;
                break;
            case 2:
                sonuc = number1 - number2;
                break;
            case 3:
                sonuc = number1 * number2;
                break;
            case 4:
                sonuc = number1 / number2;
                break;
            default:
                System.out.println("Yanlış sayı girdiniz");
        }

        System.out.println("Sonuç: " + sonuc);
    }

}

