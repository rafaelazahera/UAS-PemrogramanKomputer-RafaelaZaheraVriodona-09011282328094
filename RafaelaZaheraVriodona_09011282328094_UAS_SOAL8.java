import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserAccount {
    private String username;
    private String password;
    private boolean isActive;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public boolean isActive() {
        return isActive;
    }

    public void toggleAccountStatus() {
        isActive = !isActive;
        System.out.println("Akun " + (isActive ? "diaktifkan." : "dinonaktifkan."));
    }
}

public class RafaelaZaheraVriodona_09011282328094_UAS_SOAL8 {
    private static Map<String, UserAccount> userAccounts = new HashMap<>();

    public static void main(String[] args) {
        UserAccount user1 = new UserAccount("cemeng", "232323");
        UserAccount user2 = new UserAccount("bombom", "300404");

        userAccounts.put(user1.getUsername(), user1);
        userAccounts.put(user2.getUsername(), user2);

        manageUserAccounts();
    }

    private static void manageUserAccounts() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        if (userAccounts.containsKey(usernameInput)) {
            UserAccount user = userAccounts.get(usernameInput);

            System.out.print("Masukkan password: ");
            String passwordInput = scanner.nextLine();

            if (user.checkPassword(passwordInput)) {
                System.out.println("Status akun: " + (user.isActive() ? "Aktif" : "Nonaktif"));
                System.out.print("Apakah Anda ingin mengaktifkan atau menonaktifkan akun? (aktif/nonaktif): ");
                String action = scanner.nextLine();

                if (action.equalsIgnoreCase("aktif") || action.equalsIgnoreCase("nonaktif")) {
                    user.toggleAccountStatus();
                } else {
                    System.out.println("Aksi tidak valid.");
                }
            } else {
                System.out.println("Password salah.");
            }
        } else {
            System.out.println("Akun tidak ditemukan.");
        }

        scanner.close();
    }
}