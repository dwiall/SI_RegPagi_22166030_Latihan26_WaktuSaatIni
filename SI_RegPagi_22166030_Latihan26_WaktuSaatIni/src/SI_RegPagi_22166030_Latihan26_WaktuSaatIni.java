import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program menampilkan waktu saat ini sesuai dengan lokasi kita berada saat ini.
 */
public class SI_RegPagi_22166030_Latihan26_WaktuSaatIni {
    public static void main(String[] args) {
        
        //membuat objek LocalDateTime dengan nama now yang merepresentasikan waktu saat ini
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        
        //Variabel
        String formattedTime = now.format(formatter);
        
        //Mencetak pesan yang menyertakan informasi waktu
        System.out.println("Hari ini adalah hari " + formattedTime);
    }
    
}
