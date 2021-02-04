
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner (System.in);
        //deklarasi variable//
        String pilihan;
        
        System.out.println("======= Program Perhitungan =======");
        System.out.println("");
        //objek class lingkaran & persegi//
        Lingkaran tampil1 = new Lingkaran();
        Persegi tampil2 = new Persegi();
        
        System.out.println("1. Hitung Lingkaran");     
        System.out.println("2. Hitung Persegi"); 
        System.out.println("");
        //membuat inputan  user//
        System.out.print("Pilihan angka anda : ");
        pilihan = masukan.nextLine();
        //percabangan switch dari variabel pilihan//
        switch(pilihan){
            case "1":
                //memanggil method void hitung dari class lingkaran menggunakan objek tampil1//
                tampil1.hitung();
                break;
            case "2":
                //memanggil method void hitung dari class lingkaran menggunakan objek tampil2//
                tampil2.hitung();
                break;
            default:
                //akan tampil jika user menginput selain no 1 atau 2//  
                System.out.println("error--- data tidak ada");    
        } 
    }
}
