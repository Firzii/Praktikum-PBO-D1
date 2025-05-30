/*
 * Nama File    : Burung.java
 * Deskripsi    : Program untuk class burung
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit.");
    }
}
