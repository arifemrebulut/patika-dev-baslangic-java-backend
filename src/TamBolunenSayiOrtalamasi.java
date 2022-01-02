import java.util.Scanner;

public class TamBolunenSayiOrtalamasi {

    public static void main(String[] args){
        int number = 0, sum = 0, numbersCount = 0;
        double avarage = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        number = scanner.nextInt();

        for (int i = 0; i <= number; i++){
            if ((i % 3 == 0) & (i % 4 == 0)){
                sum += i;
                numbersCount++;
            }
        }

        avarage = sum / numbersCount;

        System.out.println("0 dan girdiğiniz sayıya kadar olan sayılardan 3'e ve 4'e tam bölünebilenlerin ortalaması: " + avarage);
    }

}

