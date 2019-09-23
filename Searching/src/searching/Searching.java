package searching;

/**
 *
 * @Nx
 */
public class Searching {

    public static void larik(int[] data) {
        System.out.print("Data : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void sortAscending(int[] data) {
        System.out.print("Data Ascending : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.print(data[i] + " ");
        }
    }

    public static int squentialSearch(int[] larik, int kunci) {
        for (int i = 0; i < larik.length; i++) {
            if (kunci == larik[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarylSearch(int[] larik, int kunci) {
        int indeksAwal = 0;
        int indeksAkhir = larik.length - 1;
        while (indeksAwal <= indeksAkhir) {
            int indeksTengah = (indeksAwal + indeksAkhir) / 2;

            if (larik[indeksTengah] == kunci) {
                return indeksTengah;
            } else {
                if (larik[indeksTengah] > kunci) {
                    indeksAkhir = indeksTengah - 1;
                } else {
                    indeksAwal = indeksTengah + 1;
                }
            }
        }
        return -1;
    }

    public static int interpolationSearch(int[] larik, int kunci) {
        int indekAwal = 0;
        int indekAkhir = larik.length - 1;

        while (indekAwal <= indekAkhir) {
            int indekTengah = indekAwal + ((kunci - larik[indekAwal]) * (indekAkhir - indekAwal))
                    / (larik[indekAkhir] - larik[indekAwal]);
            int tengah = larik[indekTengah];
            if (tengah == kunci) {
                return indekTengah;
            } else {
                if (tengah > kunci) {
                    indekAkhir = indekTengah - 1;
                } else {
                    indekAwal = indekTengah + 1;
                }
            }
        }
        return -1;
    }
}
