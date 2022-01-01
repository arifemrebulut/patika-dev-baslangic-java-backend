import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. Sayıyı Giriniz: ");
        a = scanner.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        b = scanner.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        c = scanner.nextInt();

        if ((a < b) && (a < c)){
            if (b < c){
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)){
            if (a < c){
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else if ((c > a) && (c > b)){
            if (b < c){
                System.out.println("c < b < a");
            } else {
                System.out.println("c < a < b");
            }
        }
    }

}
