import java.util.Scanner;
public class ifCetakKRS11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
            System.out.println( uktLunas ? "Pembayaran UKT terverifikasi \nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    }
}
 
