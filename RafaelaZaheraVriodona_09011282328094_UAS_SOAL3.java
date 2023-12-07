import java.util.Scanner;

public class RafaelaZaheraVriodona_09011282328094_UAS_SOAL3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan suku ke-n: ");
            int n = scanner.nextInt();

            // Inisialisasi dua suku pertama
            int f1 = 0;
            int f2 = 1;

            // Menampilkan deret Fibonacci
            for (int i = 1; i <= n; i++) {
                System.out.print(f1 + " ");

             // Menghitung suku berikutnya
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            }
        }
    }
}