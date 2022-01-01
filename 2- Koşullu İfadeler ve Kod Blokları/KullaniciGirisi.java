import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String username = "patika", password = "123456";
        String usernamescanner, passwordscanner;
        String newPassword;
        int sifreSifirlamascanner = 0;

        System.out.print("Kullanıcı Adınız: ");
        usernamescanner = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Şifreniz: ");
        passwordscanner = scanner.nextLine();

        if (usernamescanner.equals(username) && passwordscanner.equals(password)){
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Kullanıcı adı veya şifreniz yanlış");
            System.out.print("Şifrenizi sıfırlamak isterseniz 1 rakamını tuşlayınız: ");

            try {
                sifreSifirlamascanner = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            if (sifreSifirlamascanner == 1){
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scanner.nextLine();

                if (newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    newPassword = scanner.nextLine();
                    System.out.println("Şifreniz Oluşturuldu.");
                } else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            }
        }
    }

}
