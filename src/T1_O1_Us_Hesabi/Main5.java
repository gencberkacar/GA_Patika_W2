package T1_O1_Us_Hesabi;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //veri girişlerini aldık
        System.out.print("Taban sayısını giriniz : ");
        int taban = inp.nextInt();
        System.out.print("Üst olacak sayıyı giriniz : ");
        int üst = inp.nextInt();

        System.out.println(power(taban, üst));
    }

    //Tabanı üst ile çarpıp değeri döndürdük
    public static int power(int taban, int üst) {
        if (taban == 1 || üst == 0) {
            return 1;
        }
        int result = taban * power(taban, üst - 1);
        return result;
    }
}

