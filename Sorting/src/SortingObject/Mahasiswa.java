package SortingObject;

/**
 *
 * @author Nx
 */
public class Mahasiswa implements Comparable {

    private String nama;
    private int nim;

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

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    

    @Override
    public int compareTo(Object o) {
        if (nama.compareTo(((Mahasiswa) o).getNama()) == 0) {
            return 0;
        } else if (nama.compareTo(((Mahasiswa) o).getNama()) > 0) {
            return 1;
        } else if (nama.compareTo(((Mahasiswa) o).getNama()) < 0) {
            return -1;

        }
        return -1;

    }

    @Override
    public String toString() {
        String data = "\t" + getNama() + "\t" + getNim();
        return data;
    }
}
