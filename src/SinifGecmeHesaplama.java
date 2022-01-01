import java.util.Scanner;

public class SinifGecmeHesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int matetatik, turkce, fizik, kimya, muzik;

        System.out.print("Matematik Notunuz: ");
        matetatik = scanner.nextInt();
        if (matetatik < 0 || matetatik > 100){
            System.out.println("Lütfen 100 ile 0 arasında geçerli bir sayı giriniz: ");
            matetatik = scanner.nextInt();
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = scanner.nextInt();
        if (turkce < 0 || turkce > 100){
            System.out.println("Lütfen 100 ile 0 arasında geçerli bir sayı giriniz: ");
            turkce = scanner.nextInt();
        }

        System.out.print("Fizik Notunuz: ");
        fizik = scanner.nextInt();
        if (fizik < 0 || fizik > 100){
            System.out.println("Lütfen 100 ile 0 arasında geçerli bir sayı giriniz: ");
            fizik = scanner.nextInt();
        }

        System.out.print("Kimya Notunuz: ");
        kimya = scanner.nextInt();
        if (kimya < 0 || kimya > 100){
            System.out.println("Lütfen 100 ile 0 arasında geçerli bir sayı giriniz: ");
            kimya = scanner.nextInt();
        }

        System.out.print("Müzik Notunuz: ");
        muzik = scanner.nextInt();
        if (muzik < 0 || muzik > 100){
            System.out.println("Lütfen 100 ile 0 arasında geçerli bir sayı giriniz: ");
            muzik = scanner.nextInt();
        }

        double avarage = (matetatik + turkce + fizik + kimya + muzik) / 5;

        if (avarage <= 55) {
            System.out.println("Ortalamanız: " + avarage + " Geçemediniz");
        } else  {
            System.out.println("Ortalamanız: " + avarage + "Geçtiniz");
        }
    }

}
