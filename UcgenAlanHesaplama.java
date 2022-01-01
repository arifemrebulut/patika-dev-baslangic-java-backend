import java.util.Scanner;

public class UcgenAlanHesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a ,b, c;

        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        a = scanner.nextInt();
        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        b = scanner.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
        c = scanner.nextInt();

        int u = (a+b+c) / 2;
        int cevre = 2 * u;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }

}
