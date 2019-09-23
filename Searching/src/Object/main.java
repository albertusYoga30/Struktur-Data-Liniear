package Object;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[3];
        mhs[0] = new Mahasiswa("Lila", 165314025, 95);
        mhs[1] = new Mahasiswa("lilu", 165314022, 98);
        mhs[2] = new Mahasiswa("Lala", 165314020, 90);

        SearchingObject.larik(mhs);
        System.out.println("");
        Arrays.sort(mhs);
        System.out.println("Setelah Durutkan ascending :");
        SearchingObject.larik(mhs);
        Mahasiswa cari = new Mahasiswa("Lilu", 165314022, 98);
        int hasil = SearchingObject.binarylSearch(mhs, cari);
        System.out.println("");
        if (hasil >= 0) {
            System.out.println("Data : \t" + mhs[hasil].getNama() + "\t" + mhs[hasil].getNim() + "\t" + mhs[hasil].getNilai());
            System.out.println("Ditemukan di indeks " + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

}



