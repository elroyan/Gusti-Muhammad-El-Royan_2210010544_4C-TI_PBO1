package uaspbo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KependudukanHasil {
    public static void main(String[] args) { 

    try {
            //io scanner
           Scanner scanner = new Scanner(System.in);

           //array
           KependudukanDetail[] warga = new KependudukanDetail[1];

           //perulangan
           for(int i=0; i<warga.length; i++){
                System.out.println("---------Data Penduduk---------");
                System.out.print("Masukkan Nama Penduduk  " +(i+1)+": ");
                String nama= scanner.nextLine();
                System.out.print("Masukkan Nomor Kependudukan  "+(i+1)+": ");
                String nk= scanner.nextLine();
                System.out.print("Masukkan Alamat Penduduk  "+(i+1)+": ");
                String alamat= scanner.nextLine();
                System.out.print("Masukkan Status Penduduk "+(i+1)+": ");
                String status= scanner.nextLine();
                System.out.print("Masukkan Kewarganegaraan "+(i+1)+": ");
                String kewarganegaraan= scanner.nextLine();
                System.out.println("##################################");

                 //objek1
                warga[i] = new KependudukanDetail(nama,nk,alamat,status,kewarganegaraan) ;
           }
           //perulangan
           for (KependudukanDetail hasildata: warga){
                System.out.println("---------Hasil Data Penduduk---------");
                System.out.println(hasildata.infoTampil());
                System.out.println("===================================");
           }
        //error handling
         } catch (InputMismatchException e) {
            System.out.println("Kesalahan input: Pastikan memasukkan data dengan format yang benar.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Nomor Kependudukan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    
    
    }
}
