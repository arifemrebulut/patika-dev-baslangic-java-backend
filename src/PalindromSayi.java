import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        n = scanner.nextInt();

        if (isPalindrom(n)){
            System.out.println(n + " palindrom bir sayıdır");
        } else {
            System.out.println(n + " palindrom bir sayı değildir.");
        }
    }

    public static boolean isPalindrom(int number){
        int temp = number;
        int reversedNumber = 0;
        int lastNumber = 0;

        while (temp != 0){
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (reversedNumber == number){
            return true;
        } else {
            return false;
        }
    }
}
