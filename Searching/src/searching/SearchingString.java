
package searching;

/**
 *
 * @author admin
 */
public class SearchingString {

    public static void larik(String[] data) {
        System.out.print("Data : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void sortAscending(String[] data) {
        System.out.print("Data Ascending : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i].compareTo(data[j]) > 0) {
                    String temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.print(data[i] + " ");
        }
    }

    public static int squentialSearch(String[] larik, String kunci) {
        for (int counter = 0; counter < larik.length; counter++) {
            if (kunci.compareTo(larik[counter]) == 0 ) {
                return counter;
            }
        }
        return -1;
    }

    public static int binarylSearch(String[] larik, String kunci) {
        int indeksAwal = 0;
        int indeksAkhir = larik.length - 1;
        while (indeksAwal <= indeksAkhir) {
            int indeksTengah = (indeksAwal + indeksAkhir) / 2;

            if (larik[indeksTengah].compareTo(kunci) == 0) {
                return indeksTengah;
            } else {
                if (larik[indeksTengah].compareTo(kunci) > 0) {
                    indeksAkhir = indeksTengah - 1;
                } else {
                    indeksAwal = indeksTengah + 1;
                }
            }
        }
        return -1;
    }
}
