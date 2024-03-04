package TC;
import java.util.Scanner;
public class Main8 {public static void main(String[] args) {
    Scanner veri = new Scanner(System.in);
    String[] isimler = {"Ahmet", "Ayşe", "Mehmet"};
    String[] soyisimler = {"Yılmaz", "Kaya", "Demir"};
    String[] tcNumaralari = {"12345678901", "23456789012", "34567890123"};
    boolean devam = true;

    while (devam) {
        System.out.print("İsim (Çıkmak için q/Q) :");
        String girilenIsim = veri.nextLine();

        if (girilenIsim.equals("q") || girilenIsim.equals("Q")) {
            System.out.println("Programdan çıkılıyor...");
            break;
        }

        System.out.print("Soyisim (Çıkmak için q/Q) :");
        String girilenSoyisim = veri.nextLine();

        if (girilenSoyisim.equals("q") || girilenSoyisim.equals("Q")) {
            System.out.println("Programdan çıkılıyor...");
            break;
        }

        boolean kisiBulundu = false;
        for (int i = 0; i < isimler.length; i++) {
            if (girilenIsim.equalsIgnoreCase(isimler[i]) && girilenSoyisim.equalsIgnoreCase(soyisimler[i])) {
                String tcIlkSekizRakam = tcNumaralari[i].substring(0, 8);
                String sonUcRakamYildizli = " ***";
                System.out.println("TC Kimlik Numarası: " + tcIlkSekizRakam + sonUcRakamYildizli);

                System.out.print("TC Kimlik Numarasının son 3 rakamını girin: ");
                String girilenTC = veri.nextLine();
                if (girilenTC.equals(tcNumaralari[i].substring(8))) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Hata: TC Kimlik No yanlış girildi.");
                }
                kisiBulundu = true;
                break;
            }
        }
        if (!kisiBulundu) {
            System.out.println("Hata: Kişi bulunamadı.");
        }
    }
}
}
