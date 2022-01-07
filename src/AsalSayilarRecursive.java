import java.util.Scanner;

public class AsalSayilarRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        System.out.println("Bir Sayı Giriniz: ");
        inputNumber = scanner.nextInt();

        asal(inputNumber, inputNumber / 2);
    }

    public static void asal(int number, int i){
        if (i == 1) {
            System.out.print("Sayı asaldır.");
        } else {
            if (number % i == 0){
                System.out.println("Asal değildir.");
            }
            else{
                asal(number, i - 1);
            }
        }
    }
}
