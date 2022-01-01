import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0, sum = 0;

        System.out.print("Lütfen bir sayı giriniz: ");
        inputNumber = scanner.nextInt();

        for (int i = 1; i < inputNumber; i++){
            if (inputNumber % i == 0){
                sum += i;
            }
        }

        if (sum == inputNumber){
            System.out.println(inputNumber + " Mükemmel sayıdır.");
        } else {
            System.out.println(inputNumber + " Mükemmel sayı değildir.");
        }
    }
}
