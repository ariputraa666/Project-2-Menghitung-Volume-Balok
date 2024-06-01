package projectvolumebalok;
import java.util.Scanner;

/**
 *
 * @author ariputraaa - 2201010182
 */

public class Main {
  public static void main(String[] args) {
    // Inputan Pengguna
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Panjang: ");
    double pj = scanner.nextDouble();
    System.out.print("Masukkan Lebar: ");
    double lb = scanner.nextDouble();
    System.out.print("Masukkan Tinggi: ");
    double tg = scanner.nextDouble();

    // Buat Objek Balok
    Balok balok = new Balok(pj, lb, tg);

    // Cetak Hasil
    balok.printHasil();

    // Hitung dan Cetak Luas Permukaan
    double luasPermukaan = balok.hitungLuasPermukaan();
    System.out.println("Luas Permukaan: " + luasPermukaan);

    // Hitung dan Cetak Luas Alas
    double luasAlas = balok.hitungLuasAlas();
    System.out.println("Luas Alas: " + luasAlas);
  }
}

