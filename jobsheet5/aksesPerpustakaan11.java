import java.util.Scanner;
public class aksesPerpustakaan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah Anda membawa kartu mahasiswa? (Ya/Tidak)");
        String kartuMahasiswa = sc.nextLine();

        if (kartuMahasiswa.equalsIgnoreCase("Ya")) {
            System.out.println("Akses masuk diberikan");
            }else{
                System.out.println("Apakah Anda telah melakukan registrasi online? (Ya/Tidak)");
                String registrasiOnline = sc.nextLine();
            if (registrasiOnline.equalsIgnoreCase("Ya")) {
                System.out.println("Akses masuk diberikan");
            } else {
            System.out.println("Akses masuk ditolak");
            }
            }
    }
    
}
