
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Persegi {
     //method void hitung input user//
     void hitung(){
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner (System.in);
        //deklarasi variable//
        Double sisi, luas;
        
        System.out.println("----------------------");
        System.out.println(">>>>> Menghitung Luas Persegi <<<<<");
        System.out.println("");
        //membuat inputan user//
        System.out.print("Masukkan Sisi : ");
        sisi = masukan.nextDouble();  
        //rumus luas persegi//
        luas = sisi*sisi;
        //output//
        System.out.print("Luas Persegi Dengan Panjang Sisi " +sisi);
        System.out.println(" Adalah " +luas);
    }
}
    

