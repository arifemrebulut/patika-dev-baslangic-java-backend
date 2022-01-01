import java.util.Scanner;

public class BasamaklarToplami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0, number = 0, sum = 0, numberCounter = 0;

        System.out.print("Bir Sayı Giriniz: ");
        inputNumber = scanner.nextInt();
        number = inputNumber;

        while (inputNumber != 0){
            inputNumber /= 10;
            numberCounter++;
        }

        System.out.println(numberCounter);

        for (int i = 0; i < numberCounter; i++){
            sum +=  number % 10;
            number /= 10;
        }

        System.out.println("Basamaklar toplamı: " + sum);
    }
}
