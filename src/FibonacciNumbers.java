import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0, number1 = 0, number2 = 1;

        System.out.print("Lütfen bir sayı giriniz: ");
        inputNumber = scanner.nextInt();

        for (int i = 0; i < inputNumber; i++){
            System.out.print(number1 + " ");

            int number3 = number1 + number2;

            number1 = number2;
            number2 = number3;
        }
    }
}
