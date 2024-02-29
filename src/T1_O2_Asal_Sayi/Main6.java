package T1_O2_Asal_Sayi;
import java.util.Scanner;
public class Main6 {

    static int i = 2;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //veri girişlerini sağladık
        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
        //en kücük asal sayıdan döngüyü başlattık
        if (number < 2)
            System.out.println("En küçük asal sayı 2'dir. Başka bir sayı giriniz.");
        else if (isPrime(number))
            System.out.println(number + " sayısı ASALDIR !");
        else
            System.out.println(number + " sayısı ASAL değildir !");

    }

    public static boolean isPrime(int number) {
        //kalanına veya bölümüne göre sayının asal olup olmadıgını belirledik
        if (i == (number / 2) + 1)
            return true;
        if (number % i == 0)
            return false;
        i++;
        return isPrime(number);
    }
}

