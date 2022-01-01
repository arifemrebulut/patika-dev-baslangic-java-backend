import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sicaklik;
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        sicaklik = scanner.nextInt();

        if (sicaklik <= 5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        } else if (sicaklik > 5 && sicaklik <= 15){
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (sicaklik > 15 && sicaklik <= 25){
            System.out.println("Piknik yapabilirsiniz");
        } else if (sicaklik > 25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }

}
