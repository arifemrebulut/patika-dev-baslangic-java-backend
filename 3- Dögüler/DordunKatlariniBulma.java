import java.util.Scanner;

public class DordunKatlariniBulma {

    public static void main(String[] args){
        int sum = 0, inputNumber = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            inputNumber = scanner.nextInt();
            if (inputNumber % 4 == 0){
                sum += inputNumber;
            }

        } while (inputNumber % 2 == 0);

        System.out.println("4'e tam bölünen sayıların toplamı: " + sum);
    }
}
