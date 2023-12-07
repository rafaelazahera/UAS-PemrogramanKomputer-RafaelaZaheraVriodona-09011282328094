import java.util.Scanner;

public class RafaelaZaheraVriodona_09011282328094_UAS_SOAL1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input jumlah pembelian
            System.out.print("Masukkan jumlah barang yang dibeli : ");
            int jumlahBarang = scanner.nextInt();

            // Input harga per barang
            System.out.print("Masukkan harga per barang : ");
            double hargaPerBarang = scanner.nextDouble();

            // Hitung total harga sebelum diskon
            double totalHarga = jumlahBarang * hargaPerBarang;

            // Hitung diskon berdasarkan jumlah pembelian
            double diskon = 0.0;
            if (jumlahBarang >= 5 && jumlahBarang <= 10) {
                diskon = 0.05; // Diskon 5%
            } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
                diskon = 0.1; // Diskon 10%
            } else if (jumlahBarang > 20) {
                diskon = 0.2; // Diskon 20%
            }

            // Hitung total harga setelah diskon
            double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

            // Tampilkan total harga setelah diskon
            System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);
        }

}
}