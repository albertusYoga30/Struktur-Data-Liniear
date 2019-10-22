package SortingObject;

/**
 *
 * @author Nx
 */
public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[4];
        mhs[0] = new Mahasiswa("ab", 165314027);
        mhs[1] = new Mahasiswa("ca", 165314026);
        mhs[2] = new Mahasiswa("bdS", 165314011);
        mhs[3] = new Mahasiswa("da", 165314023);

        System.out.println("Data Awal");
        LarikObject.larik(mhs);
        System.out.println("");
        System.out.println("Sort By Name :");
        LarikObject.quickSort(mhs, 0, mhs.length - 1);
        LarikObject.larik(mhs);
        System.out.println("Sort By NIM :");
        System.out.println("");
        LarikObject.quickSort(mhs, 0, mhs.length-1);
        
    }

}
