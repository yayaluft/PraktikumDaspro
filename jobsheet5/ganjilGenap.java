import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();
        if (angka %2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
