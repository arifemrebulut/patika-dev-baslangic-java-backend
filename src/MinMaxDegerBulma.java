import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0, biggestNumber = 0, smallestNumber = 0;

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        numberCount = scanner.nextInt();

        for (int i = 1; i <= numberCount; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            int inputNumber = scanner.nextInt();

            if (i == 1) {
                smallestNumber = inputNumber;
                biggestNumber = inputNumber;
            } else if (inputNumber > biggestNumber) {
                biggestNumber = inputNumber;
            } else if (inputNumber < smallestNumber){
                smallestNumber = inputNumber;
            }
        }

        System.out.println("En büyük sayı: " + biggestNumber + " En Küçük sayı: " + smallestNumber);
    }
}
