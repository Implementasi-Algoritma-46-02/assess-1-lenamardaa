
import java.util.Scanner;

public class ValidasiNomorID {

    // Fungsi untuk memeriksa apakah nomor ID valid
    public static boolean cekValid(String input) {
        // Cek apakah input terdiri dari 3 digit, berbeda, terurut, dan digit terakhir ganjil
        return input.length() == 3 &&
               input.matches("[0-9]+") &&
               input.charAt(0) < input.charAt(1) &&
               input.charAt(1) < input.charAt(2) &&
               (input.charAt(2) - '0') % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan lima nomor ID
        System.out.println("Masukkan lima nomor ID satu per satu:");

        // Memproses setiap input dan menampilkan hasil
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nomor ID ke-" + i + ": ");
            String input = scanner.nextLine();

            // Validasi dan tampilkan hasil
            String hasil = cekValid(input) ? "valid" : "tidak valid";
            System.out.println(input + " " + hasil);
        }

        scanner.close(); // Menutup scanner
    }
}
