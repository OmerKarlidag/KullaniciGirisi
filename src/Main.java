import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int a;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("java") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.println("Hatalı Giriş Yaptınız !");
            System.out.println("Şifrenizi Sıfırlamak İstiyorsanız 1'i İstemiyorsanız 2'yi Tuşlayınız");
            a = inp.nextInt();
            switch (a){
                case 1:
                    System.out.println("Yeni Şifreyi Giriniz");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else {
                        System.out.println("Yeni Şifre Oluşturuldu");
                    }
                    break;
                default:
                    System.out.println("Şifreniz değiştirldi");
            }
        }
    }
}
