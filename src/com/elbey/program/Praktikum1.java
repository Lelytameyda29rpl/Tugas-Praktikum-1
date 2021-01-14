/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elbey.program;

/**
 *
 * @author MOKLET-2
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Perulangan untuk jumlah pola
        for(int i=1; i<=4; i++){
        for(int j=1; j<=4; j++){
        //Percabangan kondisinya
            if (i==1 || i==4 || j==1 || j==4){
        //Akan mengeluarkan pola @
                System.out.print("@");
            }else{
        //Jika bukan akan mengeluarkan spasi
                System.out.print(" ");
            }
        }
        //Untuk membuat baris baru
            System.out.println("");
        }
    }
    
}
