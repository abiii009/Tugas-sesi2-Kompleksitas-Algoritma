import java.util.Scanner;

public class PangkatDuaIterasi {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Pangkat Dua (Iterasi) ===");
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Variabel untuk menyimpan hasil
        int hasil = 0;

        // Proses iterasi untuk menghitung pangkat dua
        for (int i = 1; i <= bilangan; i++) {
            hasil += bilangan; // menambahkan bilangan sebanyak 'bilangan' kali
        }

        // Menampilkan hasil akhir
        System.out.println("Hasil dari " + bilangan + " pangkat dua adalah: " + hasil);

        // Menutup objek scanner
        input.close();
    }
}
