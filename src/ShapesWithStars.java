import java.util.Scanner;

public class ShapesWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber;

        System.out.print("Lütfen bir sayı giriniz: ");
        inputNumber = scanner.nextInt();

        for (int i = 1; i <= inputNumber; i++){

            for (int j = 1; j <= inputNumber - i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = inputNumber; i >= 1; i--){

            for (int j = 1; j <= inputNumber - i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
