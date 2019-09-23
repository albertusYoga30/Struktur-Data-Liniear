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
            for (int elemen = 0; elemen < larik.length-1-iterasi; elemen++) {
                if (larik[elemen] > larik[elemen + 1]) {
                    int temp;
                    temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen+1] = temp;                    
                }                
            }
        }
    }
}
