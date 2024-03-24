import java.util.Scanner;

public class Demo {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Selamat datang di sistem login library");
        System.out.println("Silakan pilih jenis user:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

       
        switch (choice) {
            case 1:
                adminLogin(scanner);
                break;
            case 2:
                mahasiswaLogin(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }

    
    private static void adminLogin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login admin berhasil");
            
            System.out.println("Silakan melakukan proses upload tugas ke GitHub");
        } else {
            System.out.println("Username atau password admin salah");
        }
    }

    
    private static void mahasiswaLogin(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        
        if (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 karakter");
            return;
        }

        
        System.out.println("Login mahasiswa berhasil");
    }
}
