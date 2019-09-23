/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class MainString {
    public static void main(String[] args) {
        String[]larik = new String[]{"Johan","yhoss","wiliam" };
        String key = "johan";
    
        
        SearchingString.larik(larik);
        System.out.println("");
        SearchingString.sortAscending(larik);
        System.out.println("");
        System.out.println("Data yang dicari : "+key);
        if(SearchingString.binarylSearch(larik, key)>= 0){
            System.out.println("Data "+key+" ditemukan di indek ke "+SearchingString.binarylSearch(larik, key));
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
//MAKE OBJECTTTTT
