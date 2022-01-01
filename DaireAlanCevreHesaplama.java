import java.util.Scanner;

public class DaireAlanCevreHesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        double r = 0;
        double a = 0;
        double cevre = 0;
        double alan = 0;

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = scanner.nextDouble();
        System.out.print("Lütfen daire diliminin merkez açısını giriniz: ");
        a = scanner.nextDouble();

        cevre = 2 * (pi * r);
        alan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Daire diliminin alanı: " + alan);
    }

}