
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
public class Lingkaran {
    //method void hitung input user//
    void hitung(){
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner(System.in);
        //deklarasi variable//
        double luas, r;
        
        System.out.println("----------------------");
        System.out.println(">>>> Menghitung Luas Lingkaran <<<<");
        System.out.println("");
        
        //membuat inputan user//
        System.out.print("Masukan Jari-jari : ");
        r = masukan.nextDouble();
        //rumus luas lingkaran//
        luas = 3.14*r*r;
        
        //output//
        System.out.print("Luas Lingkaran Dengan Jari-jari "+r);
        System.out.println(" Adalah "+luas);
    }
}
    

