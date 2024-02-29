package T1_O3_Desene_Gore_Metot;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int N = inp.nextInt();
        System.out.print("Çıktısı : ");

        desenEksi(N, N);

    }

    static int desenEksi(int n,int nArt) {
        System.out.print(n + " ");
        if (n > 0) {
            n -= 5;
            return desenEksi(n, nArt);
        } else {
            return desenArtı(n, nArt);
        }
    }

    static int desenArtı(int n,int nArt) {
        if (n < nArt) {
            n += 5;
            System.out.print(n + " ");
            return desenArtı(n, nArt);
        }
        else
            return n;
    }
}

