//no 8
 
package prtemuan2;

public class WaktuCahaya {
    public static void main(String[] args) {
        double jarakBulan = 384400.0; // dalam km
        double jarakMatahari = 152100000.0; // 152.1 juta km
        double kecepatanCahaya = 300000.0; // km/s
        
        double waktuKeBulanDetik = jarakBulan / kecepatanCahaya;
        double waktuKeMatahariDetik = jarakMatahari / kecepatanCahaya;
        
        // Konversi detik ke menit untuk bulan
        double waktuKeBulanMenit = waktuKeBulanDetik / 60;
        // Konversi detik ke jam untuk matahari
        double waktuKeMatahariJam = waktuKeMatahariDetik / 3600;
        
        System.out.println("Waktu tempuh dari bumi ke bulan: " + waktuKeBulanDetik + " detik (" + waktuKeBulanMenit + " menit)");
        System.out.println("Waktu tempuh dari bumi ke matahari: " + waktuKeMatahariDetik + " detik (" + waktuKeMatahariJam + " jam)");
    }
}
    

