
package searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]larik = new int[]{5,3,1,9,7};
        int key = 1;
        
        Searching.larik(larik);
        System.out.println("");
        Searching.sortAscending(larik);
        System.out.println("");
        System.out.println("Data yang dicari : "+key);
        if(Searching.binarylSearch(larik, key)>=0){
            System.out.println("Data "+key+" ditemukan di indek ke "+Searching.binarylSearch(larik, key));
        }else{
            System.out.println("Data tidak ditemukan");
        }       
        
    }
}

