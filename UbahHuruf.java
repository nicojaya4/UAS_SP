import java.util.Scanner;

public class UbahHuruf {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input kalimat dari pengguna
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Variabel untuk menyimpan hasil yang diubah
        StringBuilder hasil = new StringBuilder();
        
        // Mengubah setiap huruf menjadi huruf besar atau kecil
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            
            // Jika karakter adalah huruf kecil, ubah menjadi huruf besar
            if (Character.isLowerCase(karakter)) {
                hasil.append(Character.toUpperCase(karakter));
            }
            // Jika karakter adalah huruf besar, ubah menjadi huruf kecil
            else if (Character.isUpperCase(karakter)) {
                hasil.append(Character.toLowerCase(karakter));
            }
            // Jika karakter bukan huruf, tambahkan tanpa perubahan
            else {
                hasil.append(karakter);
            }
        }
        
        // Output hasil
        System.out.println("Output: " + hasil.toString());
        
        // Menutup scanner
        scanner.close();
    }
}
