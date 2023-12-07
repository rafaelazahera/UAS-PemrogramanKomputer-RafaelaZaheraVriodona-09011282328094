import java.util.Stack;

public class RafaelaZaheraVriodona_09011282328094_UAS_SOAL9 {

    // Metode untuk memeriksa kecocokan kurung
    public static boolean periksaKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        // Iterasi melalui setiap karakter dalam ekspresi
        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '[' || karakter == '{') {
                // Kurung buka, masukkan ke dalam stack
                stack.push(karakter);
            } else if (karakter == ')' || karakter == ']' || karakter == '}') {
                // Kurung tutup, periksa apakah sesuai dengan kurung buka terakhir dalam stack
                if (stack.isEmpty() || !isKurungSesuai(stack.pop(), karakter)) {
                    return false; // Kurung tidak sesuai
                }
            }
        }

        // Pastikan stack kosong setelah mengecek semua karakter
        return stack.isEmpty();
    }

    // Metode untuk memeriksa apakah pasangan kurung sesuai
    private static boolean isKurungSesuai(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '[' && tutup == ']') ||
               (buka == '{' && tutup == '}');
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        String ekspresi1 = "{(a+b)*(c-d)}";
        String ekspresi2 = "[a+b]*c-d)";
        String ekspresi3 = "((a+b)*(c-d)";

        // Memeriksa ekspresi
        System.out.println("Ekspresi 1: " + (periksaKurung(ekspresi1) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 2: " + (periksaKurung(ekspresi2) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 3: " + (periksaKurung(ekspresi3) ? "Benar" : "Salah"));
    }
}
