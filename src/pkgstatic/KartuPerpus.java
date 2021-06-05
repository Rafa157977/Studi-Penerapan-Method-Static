/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class KartuPerpus {
    static void pembuka(){
        System.out.println("Kartu Anggota Perpus");
    }
    static void isiTampil(){
        Scanner in = new Scanner(System.in);
        String nama, nis, namaperpus, alamat;
        
        System.out.println("Masukkan Nama         :");
        nama = in.nextLine();
        System.out.println("Masukkan NIS          :");
        nis = in.nextLine();
        System.out.println("Masukkan Perpustakaan :");
        namaperpus = in.nextLine();
        System.out.println("Masukkan Alamat Rumah :");
        alamat = in.nextLine();
        
        System.out.println("Kartu Anggota Perpustakaan");
        System.out.println("Nama         : "+nama);
        System.out.println("NIS          : "+nis);
        System.out.println("Perpustakaan : "+namaperpus);
        System.out.println("Alamat Rumah : "+alamat);
    }
    static void penutup(){
        System.out.println("Selesai");
    }
}
