/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author admin
 */
public class Larik {

    public static void larik(int[] data) {
        System.out.print("Data : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void bubleSort(int[] larik) {
        for (int iterasi = 0; iterasi < larik.length; iterasi++) {
            for (int elemen = 0; elemen < larik.length - 1 - iterasi; elemen++) {
                if (larik[elemen] > larik[elemen + 1]) {
                    int temp;
                    temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] larik) {
        for (int i = 0; i < larik.length; i++) {
            int minIndex = i;
            for (int elemen = i + 1; elemen < larik.length; elemen++) {
                if (larik[elemen] < larik[minIndex]) {
                    minIndex = elemen;
                }
            }
            int temp;
            temp = larik[minIndex];
            larik[minIndex] = larik[i];
            larik[i] = temp;
        }
    }
    public static void insertionSort(int[] larik){
        for (int i = 1; i <= larik.length-1; i++) {
            for (int j = i; j >= 1; j--) {
                if (larik[j]<larik[j-1]) {
                    int temp;
                    temp = larik[j];
                    larik[j]= larik[j-1];
                    larik[j-1] =temp;                
                }                
            }            
        }
    }
}
