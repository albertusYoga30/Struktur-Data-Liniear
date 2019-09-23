package Object;

public class Mahasiswa implements Comparable {

    private String nama;
    private int nim;
    private double nilai;

    public Mahasiswa(String nama, int nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(int nim) {
        this.nim = nim;
    }

    public Mahasiswa(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    @Override
    public int compareTo(Object o) {
        if (nama.compareTo(((Mahasiswa) o).getNama()) == 0 || nim == ((Mahasiswa) o).getNim() || nilai == ((Mahasiswa) o).getNilai()) {
            return 0;
        } else if ((nama.compareTo(((Mahasiswa) o).getNama()) > 0)) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        String data = "\t" + getNama() + "\t" + getNim() + "\t" + getNilai();
        return data;
    }

}
