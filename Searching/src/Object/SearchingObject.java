package Object;

/**
 *
 * @author admin
 */
public class SearchingObject {

    public static void larik(Object[] data) {
        System.out.print("Data : ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }

    public static int binarylSearch(Object[] larik, Object kunci) {
        int indeksAwal = 0;
        int indeksAkhir = larik.length - 1;
        while (indeksAwal <= indeksAkhir) {
            int indeksTengah = (indeksAwal + indeksAkhir) / 2;

            if (((Comparable) larik[indeksTengah]).compareTo(kunci) == 0) {
                return indeksTengah;
            } else {
                if (((Comparable) larik[indeksTengah]).compareTo(kunci) > 0) {
                    indeksAkhir = indeksTengah - 1;
                } else {
                    indeksAwal = indeksTengah + 1;
                }
            }
        }
        return -1;
    }

    public static int squentialSearch(Object[] larik, Object kunci) {
        for (int counter = 0; counter < larik.length; counter++) {
            if (((Comparable) kunci).compareTo(larik[counter]) == 0) {
                return counter;
            }
        }
        return -1;
    }

    public static void sortAscending(Object[] data) {
        System.out.println("Data Ascending : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (((Comparable) data[i]).compareTo(data[j]) > 0) {
                    Object temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.println(data[i] + " ");
        }
    }

}
