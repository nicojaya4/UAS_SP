import java.util.Scanner;

public class TambahSpasi {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input kalimat dari pengguna
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Variabel untuk menyimpan hasil dengan spasi
        String hasil = "";
        
        // Menambahkan spasi di antara setiap karakter kecuali spasi
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            
            if (karakter != ' ') {
                hasil += karakter + " "; // Menambahkan karakter dan spasi
            } else {
                hasil += karakter; // Menambahkan spasi tanpa perubahan
            }
        }
        
        // Output hasil
        System.out.println("Output: " + hasil.trim());
        
        // Menutup scanner
        scanner.close();
    }
}
