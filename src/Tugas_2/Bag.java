package Tugas_2;

public class Bag implements Comparable<Bag>{
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    int stok;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    @Override
    public String toString() {
        return "{" + kodeBarang + ", " + jenisBarang + ", " + namaBarang + ", " + stok + "} | ";
    }
    @Override
    public int compareTo(Bag o) {
        return this.getKodeBarang().compareTo(o.getKodeBarang());
    }
}