import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.print("Lütfen bir sayı giriniz: ");
        int userInput = scanner.nextInt();

        if (userInput < 1) {
            System.out.print("Geçersiz değer girdiniz.");
        } else {
            for (int i = 1; i <= userInput; i *= 4) {
                numbers.add(i);
            }
            for (int j = 1; j <= userInput; j *= 5) {
                numbers.add(j);
            }

            System.out.print("4 ve 5'in kuvvetleri: " + numbers);
        }
    }
}
