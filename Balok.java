package projectvolumebalok;
/**
 *
 * @author ariputraaa - 2201010182
 */
public class Balok {
  // Atribut (Private)
  private double pj;
  private double lb;
  private double tg;

  // Constructor
  public Balok(double pj, double lb, double tg) {
    this.pj = pj;
    this.lb = lb;
    this.tg = tg;
  }

  // Setter untuk Panjang (Public)
  public void setPj(double npj) {
    pj = npj;
  }

  // Setter untuk Lebar (Public)
  public void setLb(double nlb) {
    lb = nlb;
  }

  // Setter untuk Tinggi (Public)
  public void setTg(double ntg) {
    tg = ntg;
  }

  // Hitung Volume (Public)
  public double hitungVolume() {
    return pj * lb * tg;
  }

  // Cetak Hasil (Public)
  public void printHasil() {
    System.out.println("Panjang: " + pj);
    System.out.println("Lebar: " + lb);
    System.out.println("Tinggi: " + tg);
    System.out.println("Volume: " + hitungVolume());
  }

  // Metode Tambahan 1: Hitung Luas Permukaan
  public double hitungLuasPermukaan() {
    return 2 * (pj * lb + pj * tg + lb * tg);
  }

  // Metode Tambahan 2: Hitung Luas Alas
  public double hitungLuasAlas() {
    return pj * lb;
  }
}


