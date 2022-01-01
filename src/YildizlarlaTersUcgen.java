import java.util.Scanner;

public class YildizlarlaTersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;

        System.out.print("Lütfen basamak miktarını giriniz: ");
        inputNumber = scanner.nextInt();

        for (int i = 1; i <= inputNumber; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (inputNumber * 2) - ((2 * i) - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
