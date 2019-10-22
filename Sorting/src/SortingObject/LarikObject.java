package SortingObject;

/**
 *
 * @author Nx
 */
public class LarikObject {
    public static void larik(Object[] data) {
        System.out.print("Data : ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }
     public static void bubleSort(Object[] larik) {
        for (int iterasi = 0; iterasi < larik.length; iterasi++) {
            for (int elemen = 0; elemen < larik.length - 1 - iterasi; elemen++) {
                if (((Comparable)larik[elemen]).compareTo(larik[elemen + 1])> 0) {
                    Object temp;
                    temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = temp;
                }
            }
        }
    }
    
    public static void insertionSort(Object[] larik){
        for (int i = 1; i <= larik.length-1; i++) {
            for (int j = i; j >= 1; j--) {
                if (((Comparable)larik[j]).compareTo(larik[j-1])<0) {
                    Object temp;
                    temp = larik[j];
                    larik[j]= larik[j-1];
                    larik[j-1] =temp;                
                }                
            }            
        }
    }
    
    
    public static void selectionSort(Object[] larik) {
        for (int i = 0; i < larik.length; i++) {
            int minIndex = i;
            for (int elemen = i + 1; elemen < larik.length; elemen++) {
                if (((Comparable)larik[elemen]).compareTo(larik[minIndex])<0) {
                    minIndex = elemen;
                }
            }
            Object temp;
            temp = larik[minIndex];
            larik[minIndex] = larik[i];
            larik[i] = temp;
        }
    }
    
    public static void quickSort(Object[] larik, int awal, int akhir) {

        if (awal < akhir) {
            int i = awal + 1;
            int j = akhir;

            while (i <= akhir && ((Comparable)larik[i]).compareTo(larik[awal]) <= 0) {
                i++;
            }
            while (j > awal && ((Comparable)larik[j]).compareTo(larik[awal]) >0) {
                j--;
            }
            while (i < j) {
                Object temp;
                temp = larik[i];
                larik[i] = larik[j];
                larik[j] = temp;

                while (i <= akhir && ((Comparable)larik[i]).compareTo(larik[awal])<= 0) {
                    i++;
                }
                while (j > awal && ((Comparable)larik[j]).compareTo(larik[awal])>0) {
                    j--;
                }
            }
            Object temp;
            temp = larik[awal];
            larik[awal] = larik[j];
            larik[j] = temp;

            quickSort(larik, awal, j - 1);
            quickSort(larik, j+1, akhir);

        }

    }
       
}
